package cn.saberking.jvav.apm.mall.service.impl;

import cn.saberking.jvav.apm.mall.domain.ApmStoreOrderCartInfo;
import cn.saberking.jvav.apm.mall.mapper.ApmStoreOrderCartInfoMapper;
import cn.saberking.jvav.apm.mall.service.IApmStoreOrderCartInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单购物详情Service业务层处理
 *
 * @author apm
 * @date 2020-10-07
 */
@Service
public class ApmStoreOrderCartInfoServiceImpl implements IApmStoreOrderCartInfoService {
    @Resource
    private ApmStoreOrderCartInfoMapper apmStoreOrderCartInfoMapper;

    /**
     * 查询订单购物详情
     *
     * @param id 订单购物详情ID
     * @return 订单购物详情
     */
    @Override
    public ApmStoreOrderCartInfo selectApmStoreOrderCartInfoById(Integer id) {
        return apmStoreOrderCartInfoMapper.selectApmStoreOrderCartInfoById(id);
    }

    /**
     * 查询订单购物详情列表
     *
     * @param apmStoreOrderCartInfo 订单购物详情
     * @return 订单购物详情
     */
    @Override
    public List<ApmStoreOrderCartInfo> selectApmStoreOrderCartInfoList(ApmStoreOrderCartInfo apmStoreOrderCartInfo) {
        return apmStoreOrderCartInfoMapper.selectApmStoreOrderCartInfoList(apmStoreOrderCartInfo);
    }

    /**
     * 新增订单购物详情
     *
     * @param apmStoreOrderCartInfo 订单购物详情
     * @return 结果
     */
    @Override
    public int insertApmStoreOrderCartInfo(ApmStoreOrderCartInfo apmStoreOrderCartInfo) {
        return apmStoreOrderCartInfoMapper.insertApmStoreOrderCartInfo(apmStoreOrderCartInfo);
    }

    /**
     * 修改订单购物详情
     *
     * @param apmStoreOrderCartInfo 订单购物详情
     * @return 结果
     */
    @Override
    public int updateApmStoreOrderCartInfo(ApmStoreOrderCartInfo apmStoreOrderCartInfo) {
        return apmStoreOrderCartInfoMapper.updateApmStoreOrderCartInfo(apmStoreOrderCartInfo);
    }

    /**
     * 批量删除订单购物详情
     *
     * @param ids 需要删除的订单购物详情ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreOrderCartInfoByIds(Integer[] ids) {
        return apmStoreOrderCartInfoMapper.deleteApmStoreOrderCartInfoByIds(ids);
    }

    /**
     * 删除订单购物详情信息
     *
     * @param id 订单购物详情ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreOrderCartInfoById(Integer id) {
        return apmStoreOrderCartInfoMapper.deleteApmStoreOrderCartInfoById(id);
    }
}
