package cn.saberking.jvav.apm.mall.service.impl;

import cn.saberking.jvav.apm.common.constant.UserConstants;
import cn.saberking.jvav.apm.common.exception.CustomException;
import cn.saberking.jvav.apm.common.utils.DateUtils;
import cn.saberking.jvav.apm.common.utils.StringUtils;
import cn.saberking.jvav.apm.mall.domain.ApmUser;
import cn.saberking.jvav.apm.mall.mapper.ApmUserMapper;
import cn.saberking.jvav.apm.mall.service.IApmUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户Service业务层处理
 *
 * @author apm
 * @date 2020-10-07
 */
@Service
public class ApmUserServiceImpl implements IApmUserService {
    @Resource
    private ApmUserMapper apmUserMapper;

    /**
     * 查询用户
     *
     * @param userId 用户ID
     * @return 用户
     */
    @Override
    public ApmUser selectApmUserById(Long userId) {
        return apmUserMapper.selectApmUserById(userId);
    }

    @Override
    public String checkPhoneUnique(ApmUser apmUser) {
        long userId = StringUtils.isNull(apmUser.getUserId()) ? -1L : apmUser.getUserId();
        ApmUser info = apmUserMapper.checkPhoneUnique(apmUser.getPhoneNumber());
        if (StringUtils.isNotNull(info) && info.getUserId() != userId) {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 查询用户列表
     *
     * @param apmUser 用户
     * @return 用户
     */
    @Override
    public List<ApmUser> selectApmUserList(ApmUser apmUser) {
        return apmUserMapper.selectApmUserList(apmUser);
    }

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    @Override
    public ApmUser selectApmUserByUserName(String userName) {
        return apmUserMapper.selectUserByUserName(userName);
    }

    /**
     * 新增用户
     *
     * @param apmUser 用户
     * @return 结果
     */
    @Override
    public int insertApmUser(ApmUser apmUser) {
        apmUser.setCreateTime(DateUtils.getNowDate());
        return apmUserMapper.insertApmUser(apmUser);
    }

    /**
     * 修改用户
     *
     * @param apmUser 用户
     * @return 结果
     */
    @Override
    public int updateApmUser(ApmUser apmUser) {
        apmUser.setUpdateTime(DateUtils.getNowDate());
        return apmUserMapper.updateApmUser(apmUser);
    }

    /**
     * 修改用户状态
     *
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public int updateUserStatus(ApmUser user) {
        return apmUserMapper.updateApmUser(user);
    }

    /**
     * 逻辑批量删除用户
     *
     * @param userIds 需要删除的用户ID
     * @return 结果
     */
    @Override
    public int deletedApmUserByIds(Long[] userIds) {
        return apmUserMapper.deletedApmUserByIds(userIds);
    }

    /**
     * 批量删除用户
     *
     * @param userIds 需要删除的用户ID
     * @return 结果
     */
    @Override
    public int deleteApmUserByIds(Long[] userIds) {
        return apmUserMapper.deleteApmUserByIds(userIds);
    }

    /**
     * 校验用户是否允许操作
     *
     * @param user 用户信息
     */
    @Override
    public void checkUserAllowed(ApmUser user) {
        if (!StringUtils.isNotNull(user.getUserId())) {
            throw new CustomException("用户ID不能为空");
        }
    }

    /**
     * 重置用户密码
     *
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public int resetPwd(ApmUser user) {
        return apmUserMapper.updateApmUser(user);
    }

    /**
     * 删除用户信息
     *
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public int deleteApmUserById(Long userId) {
        return apmUserMapper.deleteApmUserById(userId);
    }
}
