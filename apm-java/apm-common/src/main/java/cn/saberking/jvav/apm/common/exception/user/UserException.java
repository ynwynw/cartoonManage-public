package cn.saberking.jvav.apm.common.exception.user;

import cn.saberking.jvav.apm.common.exception.BaseException;

/**
 * 用户信息异常类
 *
 * @author apm
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
