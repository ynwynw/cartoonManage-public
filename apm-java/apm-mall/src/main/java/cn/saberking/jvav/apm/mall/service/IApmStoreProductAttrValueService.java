package cn.saberking.jvav.apm.mall.service;

import cn.saberking.jvav.apm.mall.domain.ApmStoreProductAttrValue;

import java.util.List;

/**
 * 商品属性值Service接口
 *
 * @author apm
 * @date 2020-10-11
 */
public interface IApmStoreProductAttrValueService {
    /**
     * 查询商品属性值
     *
     * @param id 商品属性值ID
     * @return 商品属性值
     */
    ApmStoreProductAttrValue selectApmStoreProductAttrValueById(Integer id);

    /**
     * 查询商品属性值列表
     *
     * @param apmStoreProductAttrValue 商品属性值
     * @return 商品属性值集合
     */
    List<ApmStoreProductAttrValue> selectApmStoreProductAttrValueList(ApmStoreProductAttrValue apmStoreProductAttrValue);

    /**
     * 新增商品属性值
     *
     * @param apmStoreProductAttrValue 商品属性值
     * @return 结果
     */
    int insertApmStoreProductAttrValue(ApmStoreProductAttrValue apmStoreProductAttrValue);

    /**
     * 修改商品属性值
     *
     * @param apmStoreProductAttrValue 商品属性值
     * @return 结果
     */
    int updateApmStoreProductAttrValue(ApmStoreProductAttrValue apmStoreProductAttrValue);

    /**
     * 批量删除商品属性值
     *
     * @param ids 需要删除的商品属性值ID
     * @return 结果
     */
    int deleteApmStoreProductAttrValueByIds(Integer[] ids);

    /**
     * 删除商品属性值信息
     *
     * @param id 商品属性值ID
     * @return 结果
     */
    int deleteApmStoreProductAttrValueById(Integer id);
}
