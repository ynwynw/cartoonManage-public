package cn.saberking.jvav.apm.common.enums;

/**
 * 用户状态
 *
 * @author apm
 */
public enum FileType {
    /**
     * 图片类型
     */
    IMAGE(0, "图片"),
    /**
     * 音频
     */
    AUDIO(1, "音频"),
    /**
     * 视频
     */
    VIDEO(2, "视频"),
    /**
     * 文档
     */
    DOCUMENT(3, "文档"),
    /**
     * 其他
     */
    OTHER(4, "其他");

    private final int code;
    private final String info;

    FileType(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
