package cn.saberking.jvav.apm.mall.service.impl;

import cn.saberking.jvav.apm.mall.domain.ApmStoreProductAttrValue;
import cn.saberking.jvav.apm.mall.mapper.ApmStoreProductAttrValueMapper;
import cn.saberking.jvav.apm.mall.service.IApmStoreProductAttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品属性值Service业务层处理
 *
 * @author apm
 * @date 2020-10-11
 */
@Service
public class ApmStoreProductAttrValueServiceImpl implements IApmStoreProductAttrValueService {
    @Resource
    private ApmStoreProductAttrValueMapper apmStoreProductAttrValueMapper;

    /**
     * 查询商品属性值
     *
     * @param id 商品属性值ID
     * @return 商品属性值
     */
    @Override
    public ApmStoreProductAttrValue selectApmStoreProductAttrValueById(Integer id) {
        return apmStoreProductAttrValueMapper.selectApmStoreProductAttrValueById(id);
    }

    /**
     * 查询商品属性值列表
     *
     * @param apmStoreProductAttrValue 商品属性值
     * @return 商品属性值
     */
    @Override
    public List<ApmStoreProductAttrValue> selectApmStoreProductAttrValueList(ApmStoreProductAttrValue apmStoreProductAttrValue) {
        return apmStoreProductAttrValueMapper.selectApmStoreProductAttrValueList(apmStoreProductAttrValue);
    }

    /**
     * 新增商品属性值
     *
     * @param apmStoreProductAttrValue 商品属性值
     * @return 结果
     */
    @Override
    public int insertApmStoreProductAttrValue(ApmStoreProductAttrValue apmStoreProductAttrValue) {
        return apmStoreProductAttrValueMapper.insertApmStoreProductAttrValue(apmStoreProductAttrValue);
    }

    /**
     * 修改商品属性值
     *
     * @param apmStoreProductAttrValue 商品属性值
     * @return 结果
     */
    @Override
    public int updateApmStoreProductAttrValue(ApmStoreProductAttrValue apmStoreProductAttrValue) {
        return apmStoreProductAttrValueMapper.updateApmStoreProductAttrValue(apmStoreProductAttrValue);
    }

    /**
     * 批量删除商品属性值
     *
     * @param ids 需要删除的商品属性值ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreProductAttrValueByIds(Integer[] ids) {
        return apmStoreProductAttrValueMapper.deleteApmStoreProductAttrValueByIds(ids);
    }

    /**
     * 删除商品属性值信息
     *
     * @param id 商品属性值ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreProductAttrValueById(Integer id) {
        return apmStoreProductAttrValueMapper.deleteApmStoreProductAttrValueById(id);
    }
}
