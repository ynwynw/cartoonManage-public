package cn.saberking.jvav.apm.common.utils.file;

import cn.saberking.jvav.apm.common.config.ApmConfig;
import cn.saberking.jvav.apm.common.constant.Constants;
import cn.saberking.jvav.apm.common.core.domain.entity.SysUploadFile;
import cn.saberking.jvav.apm.common.exception.file.FileNameLengthLimitExceededException;
import cn.saberking.jvav.apm.common.exception.file.FileSizeLimitExceededException;
import cn.saberking.jvav.apm.common.exception.file.InvalidExtensionException;
import cn.saberking.jvav.apm.common.utils.DateUtils;
import cn.saberking.jvav.apm.common.utils.StringUtils;
import cn.saberking.jvav.apm.common.utils.uuid.IdUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * 文件上传工具类
 *
 * @author apm
 */
public class FileUploadUtils {
    /**
     * 默认大小 50M
     */
    public static final long DEFAULT_MAX_SIZE = 50 * 1024 * 1024;

    /**
     * 默认的文件名最大长度 100
     */
    public static final int DEFAULT_FILE_NAME_LENGTH = 100;

    /**
     * 默认上传的地址
     */
    private static String defaultBaseDir = ApmConfig.getProfile();

    public static void setDefaultBaseDir(String defaultBaseDir) {
        FileUploadUtils.defaultBaseDir = defaultBaseDir;
    }

    public static String getDefaultBaseDir() {
        return defaultBaseDir;
    }

    /**
     * 以默认配置进行文件上传
     *
     * @param file 上传的文件
     * @return 文件名称
     */
    public static String upload(MultipartFile file) throws IOException {
        try {
            return upload(getDefaultBaseDir(), file, MimeTypeUtils.DEFAULT_ALLOWED_EXTENSION);
        } catch (Exception e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /**
     * 根据文件路径上传
     *
     * @param baseDir 相对应用的基目录
     * @param file    上传的文件
     * @return 文件名称
     * @throws IOException IO异常
     */
    public static String upload(String baseDir, MultipartFile file) throws IOException {
        try {
            return upload(baseDir, file, MimeTypeUtils.DEFAULT_ALLOWED_EXTENSION);
        } catch (Exception e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /**
     * 文件上传
     *
     * @param baseDir          相对应用的基目录
     * @param file             上传的文件
     * @param allowedExtension 上传文件类型
     * @return 返回上传成功的文件名
     * @throws FileSizeLimitExceededException       如果超出最大大小
     * @throws FileNameLengthLimitExceededException 文件名太长
     * @throws IOException                          比如读写文件出错时
     * @throws InvalidExtensionException            文件校验异常
     */
    public static String upload(String baseDir, MultipartFile file, String[] allowedExtension)
            throws FileSizeLimitExceededException, IOException, FileNameLengthLimitExceededException,
            InvalidExtensionException {
        int fileNameLength = Objects.requireNonNull(file.getOriginalFilename()).length();
        if (fileNameLength > FileUploadUtils.DEFAULT_FILE_NAME_LENGTH) {
            throw new FileNameLengthLimitExceededException(FileUploadUtils.DEFAULT_FILE_NAME_LENGTH);
        }

        assertAllowed(file, allowedExtension);

        String fileName = extractFilename(file);

        File desc = getAbsoluteFile(baseDir, fileName);
        System.out.println(desc);
        if (desc != null) {
            file.transferTo(desc);
        }
        return getPathFileName(baseDir, fileName);
    }

    /**
     * 文件上传
     *
     * @param baseDir          相对应用的基目录
     * @param file             上传的文件
     * @param allowedExtension 上传文件允许的类型
     * @param type             上传文件类型
     * @return 返回上传成功的文件名
     * @throws FileSizeLimitExceededException       如果超出最大大小
     * @throws FileNameLengthLimitExceededException 文件名太长
     * @throws IOException                          比如读写文件出错时
     * @throws InvalidExtensionException            文件校验异常
     */
    public static SysUploadFile uploadFile(String baseDir, MultipartFile file, String[] allowedExtension, int type)
            throws FileSizeLimitExceededException, IOException, FileNameLengthLimitExceededException,
            InvalidExtensionException {
        int fileNameLength = Objects.requireNonNull(file.getOriginalFilename()).length();
        if (fileNameLength > FileUploadUtils.DEFAULT_FILE_NAME_LENGTH) {
            throw new FileNameLengthLimitExceededException(FileUploadUtils.DEFAULT_FILE_NAME_LENGTH);
        }
        assertAllowed(file, allowedExtension);

        //创建文件实体，方便往数据库中保存
        SysUploadFile uploadFile = new SysUploadFile();
        //设置文件后缀名
        uploadFile.setSuffix(getExtension(file));

        //设置文件原始名称
        uploadFile.setName(file.getOriginalFilename());

        //设置文件真实名称
        String fileName = extractFilename(file);
        uploadFile.setRealName(fileName);

        //设置文件大小
        if (type == MimeTypeUtils.IMAGE_TYPE) {
            uploadFile.setSize(computeSize(file.getSize(), MimeTypeUtils.FILE_SIZE_KB_UNIT));
        } else {
            uploadFile.setSize(computeSize(file.getSize(), MimeTypeUtils.FILE_SIZE_MB_UNIT));
        }

        File desc = getAbsoluteFile(baseDir, fileName);

        System.out.println(desc);
        if (desc != null) {
            //设置文件真实磁盘路径
            uploadFile.setRealUrl(desc.getAbsolutePath());
            file.transferTo(desc);
        }
        String path = getPathFileName(baseDir, fileName);
        //设置文件虚拟/抽象路径
        uploadFile.setPath(path);

        //设置文件网络访问地址
        System.out.println(ApmConfig.getDomainPath());
        String domPath = StringUtils.substring(ApmConfig.getDomainPath(), 0, ApmConfig.getDomainPath().length() - 1);
        uploadFile.setUrl(domPath + path);

        return uploadFile;
    }

    /**
     * 计算文件大小
     *
     * @param len  文件长度
     * @param unit 限制单位（B,K,M,G）
     * @return 结果
     */
    public static String computeSize(Long len, String unit) {
        String fileSize = null;
        switch (unit.toUpperCase()) {
            case MimeTypeUtils.FILE_SIZE_BYTE_UNIT:
                fileSize = (double) len + unit;
                break;
            case MimeTypeUtils.FILE_SIZE_KB_UNIT:
                fileSize = ((double) len / 1024) + unit;
                break;
            case MimeTypeUtils.FILE_SIZE_MB_UNIT:
                fileSize = ((double) len / 1048576) + unit;
                break;
            case MimeTypeUtils.FILE_SIZE_GB_UNIT:
                fileSize = ((double) len / 1073741824) + unit;
                break;
            default:
                break;
        }
        return fileSize;
    }

    /**
     * 编码文件名
     */
    public static String extractFilename(MultipartFile file) {
        String extension = getExtension(file);
        return DateUtils.datePath() + "/" + IdUtils.fastUuid() + "." + extension;
    }

    private static File getAbsoluteFile(String uploadDir, String fileName) throws IOException {
        File desc = new File(uploadDir + File.separator + fileName);

        if (!desc.getParentFile().exists()) {
            boolean isMkdirs = desc.getParentFile().mkdirs();
            if (!isMkdirs) {
                return null;
            }
        }
        if (!desc.exists()) {
            boolean isCreate = desc.createNewFile();
            if (!isCreate) {
                return null;
            }
        }
        return desc;
    }

    private static String getPathFileName(String uploadDir, String fileName) {
        String currentDir = getCurrentDir(uploadDir);
        return Constants.RESOURCE_PREFIX + "/" + currentDir + "/" + fileName;
    }

    private static String getCurrentDir(String uploadDir) {
        int dirLastIndex = ApmConfig.getProfile().length() + 1;
        return StringUtils.substring(uploadDir, dirLastIndex);
    }

    /**
     * 文件大小校验
     *
     * @param file 上传的文件
     * @throws FileSizeLimitExceededException 如果超出最大大小
     * @throws InvalidExtensionException      无效扩展异常
     */
    public static void assertAllowed(MultipartFile file, String[] allowedExtension)
            throws FileSizeLimitExceededException, InvalidExtensionException {
        long size = file.getSize();
        if (size > DEFAULT_MAX_SIZE) {
            throw new FileSizeLimitExceededException(DEFAULT_MAX_SIZE / 1024 / 1024);
        }

        String fileName = file.getOriginalFilename();
        String extension = getExtension(file);
        if (allowedExtension != null && !isAllowedExtension(extension, allowedExtension)) {
            if (allowedExtension == MimeTypeUtils.IMAGE_EXTENSION) {
                throw new InvalidExtensionException.InvalidImageExtensionException(allowedExtension, extension,
                        fileName);
            } else if (allowedExtension == MimeTypeUtils.FLASH_EXTENSION) {
                throw new InvalidExtensionException.InvalidFlashExtensionException(allowedExtension, extension,
                        fileName);
            } else if (allowedExtension == MimeTypeUtils.MEDIA_EXTENSION) {
                throw new InvalidExtensionException.InvalidMediaExtensionException(allowedExtension, extension,
                        fileName);
            } else {
                throw new InvalidExtensionException(allowedExtension, extension, fileName);
            }
        }

    }

    /**
     * 判断MIME类型是否是允许的MIME类型
     *
     * @param extension        扩展
     * @param allowedExtension 允许的扩展数组
     * @return 是否允许
     */
    public static boolean isAllowedExtension(String extension, String[] allowedExtension) {
        for (String str : allowedExtension) {
            if (str.equalsIgnoreCase(extension)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取文件名的后缀
     *
     * @param file 表单文件
     * @return 后缀名
     */
    public static String getExtension(MultipartFile file) {
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        if (StringUtils.isEmpty(extension)) {
            extension = MimeTypeUtils.getExtension(Objects.requireNonNull(file.getContentType()));
        }
        return extension;
    }
}
