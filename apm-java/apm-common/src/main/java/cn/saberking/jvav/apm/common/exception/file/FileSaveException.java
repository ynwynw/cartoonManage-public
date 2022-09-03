package cn.saberking.jvav.apm.common.exception.file;

/**
 * 文件名称超长限制异常类
 *
 * @author apm
 */
public class FileSaveException extends FileException {
    private static final long serialVersionUID = 1L;

    public FileSaveException(String defaultMsg) {
        super("upload.file.save.error", new Object[]{defaultMsg});
    }
}
