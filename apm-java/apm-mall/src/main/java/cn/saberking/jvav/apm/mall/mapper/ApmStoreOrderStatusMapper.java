package cn.saberking.jvav.apm.mall.mapper;

import cn.saberking.jvav.apm.mall.domain.ApmStoreOrderStatus;

import java.util.List;

/**
 * 订单操作记录Mapper接口
 *
 * @author apm
 * @date 2020-10-07
 */
public interface ApmStoreOrderStatusMapper {
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
     * 删除订单操作记录
     *
     * @param id 订单操作记录ID
     * @return 结果
     */
    int deleteApmStoreOrderStatusById(Integer id);

    /**
     * 批量删除订单操作记录
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteApmStoreOrderStatusByIds(Integer[] ids);
}
