package cn.saberking.jvav.apm.mall.service;

import cn.saberking.jvav.apm.mall.domain.ApmStoreOrderStatus;

import java.util.List;

/**
 * 订单操作记录Service接口
 *
 * @author apm
 * @date 2020-10-07
 */
public interface IApmStoreOrderStatusService {
    /**
     * 查询订单操作记录
     *
     * @param id 订单操作记录ID
     * @return 订单操作记录
     */
    ApmStoreOrderStatus selectApmStoreOrderStatusById(Integer id);

    /**
     * 查询订单操作记录列表
     *
     * @param apmStoreOrderStatus 订单操作记录
     * @return 订单操作记录集合
     */
    List<ApmStoreOrderStatus> selectApmStoreOrderStatusList(ApmStoreOrderStatus apmStoreOrderStatus);

    /**
     * 新增订单操作记录
     *
     * @param apmStoreOrderStatus 订单操作记录
     * @return 结果
     */
    int insertApmStoreOrderStatus(ApmStoreOrderStatus apmStoreOrderStatus);

    /**
     * 修改订单操作记录
     *
     * @param apmStoreOrderStatus 订单操作记录
     * @return 结果
     */
    int updateApmStoreOrderStatus(ApmStoreOrderStatus apmStoreOrderStatus);

    /**
     * 批量删除订单操作记录
     *
     * @param ids 需要删除的订单操作记录ID
     * @return 结果
     */
    int deleteApmStoreOrderStatusByIds(Integer[] ids);

    /**
     * 删除订单操作记录信息
     *
     * @param id 订单操作记录ID
     * @return 结果
     */
    int deleteApmStoreOrderStatusById(Integer id);
}
