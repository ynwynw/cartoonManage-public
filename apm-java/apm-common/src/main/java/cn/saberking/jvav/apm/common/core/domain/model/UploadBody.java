package cn.saberking.jvav.apm.common.core.domain.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Saber污妖王
 * TODO: 图片文件上传的参数实体
 * @version 0.0.1
 * @editor Saber污妖王
 * @project apm
 * @date 2020/10/16
 * @package cn.saberking.jvav.apm.common.core.domain.model
 */
public class UploadBody {
    /**
     * 图片文件
     */
    private MultipartFile image;

    /**
     * 原图像地址
     */
    private String oldUrl;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getOldUrl() {
        return oldUrl;
    }

    public void setOldUrl(String oldUrl) {
        this.oldUrl = oldUrl;
    }
}
