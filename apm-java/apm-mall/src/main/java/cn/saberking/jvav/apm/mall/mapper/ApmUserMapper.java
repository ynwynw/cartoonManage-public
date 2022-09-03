package cn.saberking.jvav.apm.mall.mapper;

import cn.saberking.jvav.apm.mall.domain.ApmUser;

import java.util.List;

/**
 * 用户信息Mapper接口
 *
 * @author apm
 * @date 2020-10-07
 */
public interface ApmUserMapper {
    /**
     * 查询用户
     *
     * @param userId 用户ID
     * @return 用户
     */
    ApmUser selectApmUserById(Long userId);

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
    ApmUser selectUserByUserName(String userName);

    /**
     * 校验用户名称是否唯一
     *
     * @param userName 用户名称
     * @return 结果
     */
    int checkUserNameUnique(String userName);

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
     * 逻辑删除用户
     *
     * @param userId 用户ID
     * @return 结果
     */
    int deletedApmUserByIds(Long[] userId);

    /**
     * 删除用户
     *
     * @param userId 用户ID
     * @return 结果
     */
    int deleteApmUserById(Long userId);

    /**
     * 批量删除用户
     *
     * @param userIds 需要删除的数据ID
     * @return 结果
     */
    int deleteApmUserByIds(Long[] userIds);

    /**
     * 校验手机号码是否唯一
     *
     * @param phoneNumber 手机号码
     * @return 结果
     */
    ApmUser checkPhoneUnique(String phoneNumber);
}
