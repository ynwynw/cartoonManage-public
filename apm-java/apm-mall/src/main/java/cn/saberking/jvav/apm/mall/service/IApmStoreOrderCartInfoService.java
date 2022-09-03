package cn.saberking.jvav.apm.mall.service;

import cn.saberking.jvav.apm.mall.domain.ApmStoreOrderCartInfo;

import java.util.List;

/**
 * 订单购物详情Service接口
 *
 * @author apm
 * @date 2020-10-07
 */
public interface IApmStoreOrderCartInfoService {
    /**
     * 查询订单购物详情
     *
     * @param id 订单购物详情ID
     * @return 订单购物详情
     */
    ApmStoreOrderCartInfo selectApmStoreOrderCartInfoById(Integer id);

    /**
     * 查询订单购物详情列表
     *
     * @param apmStoreOrderCartInfo 订单购物详情
     * @return 订单购物详情集合
     */
    List<ApmStoreOrderCartInfo> selectApmStoreOrderCartInfoList(ApmStoreOrderCartInfo apmStoreOrderCartInfo);

    /**
     * 新增订单购物详情
     *
     * @param apmStoreOrderCartInfo 订单购物详情
     * @return 结果
     */
    int insertApmStoreOrderCartInfo(ApmStoreOrderCartInfo apmStoreOrderCartInfo);

    /**
     * 修改订单购物详情
     *
     * @param apmStoreOrderCartInfo 订单购物详情
     * @return 结果
     */
    int updateApmStoreOrderCartInfo(ApmStoreOrderCartInfo apmStoreOrderCartInfo);

    /**
     * 批量删除订单购物详情
     *
     * @param ids 需要删除的订单购物详情ID
     * @return 结果
     */
    int deleteApmStoreOrderCartInfoByIds(Integer[] ids);

    /**
     * 删除订单购物详情信息
     *
     * @param id 订单购物详情ID
     * @return 结果
     */
    int deleteApmStoreOrderCartInfoById(Integer id);
}
