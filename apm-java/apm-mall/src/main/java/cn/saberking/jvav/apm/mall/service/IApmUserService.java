package cn.saberking.jvav.apm.mall.service;

import cn.saberking.jvav.apm.mall.domain.ApmUser;

import java.util.List;

/**
 * 用户Service接口
 *
 * @author apm
 * @date 2020-10-07
 */
public interface IApmUserService {
    /**
     * 查询用户
     *
     * @param userId 用户ID
     * @return 用户
     */
    ApmUser selectApmUserById(Long userId);

    /**
     * 校验手机号码是否唯一
     *
     * @param apmUser 用户信息
     * @return 结果
     */
    String checkPhoneUnique(ApmUser apmUser);

    /**
     * 查询用户列表
     *
     * @param apmUser 用户
     * @return 用户集合
     */
    List<ApmUser> selectApmUserList(ApmUser apmUser);

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    ApmUser selectApmUserByUserName(String userName);

    /**
     * 新增用户
     *
     * @param apmUser 用户
     * @return 结果
     */
    int insertApmUser(ApmUser apmUser);

    /**
     * 修改用户
     *
     * @param apmUser 用户
     * @return 结果
     */
    int updateApmUser(ApmUser apmUser);

    /**
     * 修改用户状态
     *
     * @param user 用户信息
     * @return 结果
     */
    int updateUserStatus(ApmUser user);

    /**
     * 逻辑批量删除用户
     *
     * @param userIds 需要删除的用户ID
     * @return 结果
     */
    int deletedApmUserByIds(Long[] userIds);

    /**
     * 批量删除用户
     *
     * @param userIds 需要删除的用户ID
     * @return 结果
     */
    int deleteApmUserByIds(Long[] userIds);

    /**
     * 校验用户是否允许操作
     *
     * @param user 用户信息
     */
    void checkUserAllowed(ApmUser user);

    /**
     * 重置用户密码
     *
     * @param user 用户信息
     * @return 结果
     */
    int resetPwd(ApmUser user);

    /**
     * 删除用户信息
     *
     * @param userId 用户ID
     * @return 结果
     */
    int deleteApmUserById(Long userId);
}
