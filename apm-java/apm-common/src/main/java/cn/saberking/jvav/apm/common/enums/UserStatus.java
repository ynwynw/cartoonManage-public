package cn.saberking.jvav.apm.common.enums;

/**
 * 用户状态
 *
 * @author apm
 */
public enum UserStatus {
    /**
     * 用户状态正常
     */
    OK("0", "正常"),
    /**
     * 用户状态已停用
     */
    DISABLE("1", "停用"),
    /**
     * 用户状态已删除
     */
    DELETED("2", "删除");

    private final String code;
    private final String info;

    UserStatus(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
