package cn.saberking.jvav.apm.mall.service.impl;

import cn.saberking.jvav.apm.mall.domain.ApmStoreOrder;
import cn.saberking.jvav.apm.mall.mapper.ApmStoreOrderCartInfoMapper;
import cn.saberking.jvav.apm.mall.mapper.ApmStoreOrderMapper;
import cn.saberking.jvav.apm.mall.service.IApmStoreOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单Service业务层处理
 *
 * @author apm
 * @date 2020-10-06
 */
@Service
public class ApmStoreOrderServiceImpl implements IApmStoreOrderService {
    @Resource
    private ApmStoreOrderMapper apmStoreOrderMapper;

    @Resource
    private ApmStoreOrderCartInfoMapper apmStoreOrderCartInfoMapper;

    /**
     * 查询订单
     *
     * @param id 订单ID
     * @return 订单
     */
    @Override
    public ApmStoreOrder selectApmStoreOrderById(Integer id) {
        return apmStoreOrderMapper.selectApmStoreOrderById(id);
    }

    /**
     * 查询订单列表
     *
     * @param apmStoreOrder 订单
     * @return 订单
     */
    @Override
    public List<ApmStoreOrder> selectApmStoreOrderList(ApmStoreOrder apmStoreOrder) {
        return apmStoreOrderMapper.selectApmStoreOrderList(apmStoreOrder);
    }

    /**
     * 根据用户Id查询订单列表
     *
     * @param userId
     * @return
     */
    @Override
    public List<ApmStoreOrder> queryOrderByUserId(Integer userId) {
        return apmStoreOrderMapper.queryOrderByUserId(userId);
    }

    /**
     * 新增订单
     *
     * @param apmStoreOrder 订单
     * @return 结果
     */
    @Override
    public int insertApmStoreOrder(ApmStoreOrder apmStoreOrder) {
        return apmStoreOrderMapper.insertApmStoreOrder(apmStoreOrder);
    }

    /**
     * 修改订单
     *
     * @param apmStoreOrder 订单
     * @return 结果
     */
    @Override
    public int updateApmStoreOrder(ApmStoreOrder apmStoreOrder) {
        return apmStoreOrderMapper.updateApmStoreOrder(apmStoreOrder);
    }

    /**
     * 批量删除订单
     *
     * @param ids 需要删除的订单ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreOrderByIds(Integer[] ids) {
        return apmStoreOrderMapper.deleteApmStoreOrderByIds(ids);
    }

    /**
     * 逻辑批量删除订单
     *
     * @param ids 需要删除的订单ID
     * @return 结果
     */
    @Override
    public int deletedApmStoreOrderByIds(Integer[] ids) {
        return apmStoreOrderMapper.deletedApmStoreOrderByIds(ids);
    }

    /**
     * 删除订单信息
     *
     * @param id 订单ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreOrderById(Integer id) {
        return apmStoreOrderMapper.deleteApmStoreOrderById(id);
    }
}
