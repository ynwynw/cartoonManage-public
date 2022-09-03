package cn.saberking.jvav.apm.mall.service.impl;

import cn.saberking.jvav.apm.mall.domain.ApmStoreOrderStatus;
import cn.saberking.jvav.apm.mall.mapper.ApmStoreOrderStatusMapper;
import cn.saberking.jvav.apm.mall.service.IApmStoreOrderStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单操作记录Service业务层处理
 *
 * @author apm
 * @date 2020-10-07
 */
@Service
public class ApmStoreOrderStatusServiceImpl implements IApmStoreOrderStatusService {
    @Resource
    private ApmStoreOrderStatusMapper apmStoreOrderStatusMapper;

    /**
     * 查询订单操作记录
     *
     * @param id 订单操作记录ID
     * @return 订单操作记录
     */
    @Override
    public ApmStoreOrderStatus selectApmStoreOrderStatusById(Integer id) {
        return apmStoreOrderStatusMapper.selectApmStoreOrderStatusById(id);
    }

    /**
     * 查询订单操作记录列表
     *
     * @param apmStoreOrderStatus 订单操作记录
     * @return 订单操作记录
     */
    @Override
    public List<ApmStoreOrderStatus> selectApmStoreOrderStatusList(ApmStoreOrderStatus apmStoreOrderStatus) {
        return apmStoreOrderStatusMapper.selectApmStoreOrderStatusList(apmStoreOrderStatus);
    }

    /**
     * 新增订单操作记录
     *
     * @param apmStoreOrderStatus 订单操作记录
     * @return 结果
     */
    @Override
    public int insertApmStoreOrderStatus(ApmStoreOrderStatus apmStoreOrderStatus) {
        return apmStoreOrderStatusMapper.insertApmStoreOrderStatus(apmStoreOrderStatus);
    }

    /**
     * 修改订单操作记录
     *
     * @param apmStoreOrderStatus 订单操作记录
     * @return 结果
     */
    @Override
    public int updateApmStoreOrderStatus(ApmStoreOrderStatus apmStoreOrderStatus) {
        return apmStoreOrderStatusMapper.updateApmStoreOrderStatus(apmStoreOrderStatus);
    }

    /**
     * 批量删除订单操作记录
     *
     * @param ids 需要删除的订单操作记录ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreOrderStatusByIds(Integer[] ids) {
        return apmStoreOrderStatusMapper.deleteApmStoreOrderStatusByIds(ids);
    }

    /**
     * 删除订单操作记录信息
     *
     * @param id 订单操作记录ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreOrderStatusById(Integer id) {
        return apmStoreOrderStatusMapper.deleteApmStoreOrderStatusById(id);
    }
}
