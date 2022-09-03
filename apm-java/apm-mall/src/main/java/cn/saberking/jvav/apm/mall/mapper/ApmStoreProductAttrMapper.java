package cn.saberking.jvav.apm.mall.mapper;

import cn.saberking.jvav.apm.mall.domain.ApmStoreProductAttr;

import java.util.List;

/**
 * 商品属性Mapper接口
 *
 * @author apm
 * @date 2020-10-11
 */
public interface ApmStoreProductAttrMapper {
    /**
     * 查询商品属性
     *
     * @param id 商品属性ID
     * @return 商品属性
     */
    ApmStoreProductAttr selectApmStoreProductAttrById(Integer id);

    /**
     * 查询商品属性列表
     *
     * @param apmStoreProductAttr 商品属性
     * @return 商品属性集合
     */
    List<ApmStoreProductAttr> selectApmStoreProductAttrList(ApmStoreProductAttr apmStoreProductAttr);

    /**
     * 查询商品属性列表
     *
     * @param apmStoreProductAttr 商品属性
     * @return 商品属性集合
     */
    List<ApmStoreProductAttr> selectApmProductAttrList(ApmStoreProductAttr apmStoreProductAttr);

    /**
     * 新增商品属性
     *
     * @param apmStoreProductAttr 商品属性
     * @return 结果
     */
    int insertApmStoreProductAttr(ApmStoreProductAttr apmStoreProductAttr);

    /**
     * 修改商品属性
     *
     * @param apmStoreProductAttr 商品属性
     * @return 结果
     */
    int updateApmStoreProductAttr(ApmStoreProductAttr apmStoreProductAttr);

    /**
     * 删除商品属性
     *
     * @param id 商品属性ID
     * @return 结果
     */
    int deleteApmStoreProductAttrById(Integer id);

    /**
     * 批量删除商品属性
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteApmStoreProductAttrByIds(Integer[] ids);
}
