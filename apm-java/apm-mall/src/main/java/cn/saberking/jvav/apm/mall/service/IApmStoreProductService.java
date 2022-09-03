package cn.saberking.jvav.apm.mall.service;

import cn.saberking.jvav.apm.mall.domain.ApmStoreProduct;

import java.util.List;

/**
 * 商品Service接口
 *
 * @author apm
 * @date 2020-10-06
 */
public interface IApmStoreProductService {
    /**
     * 查询商品
     *
     * @param id 商品ID
     * @return 商品
     */
    ApmStoreProduct selectApmStoreProductById(Integer id);

    /**
     * 查询商品列表
     *
     * @param apmStoreProduct 商品
     * @return 商品集合
     */
    List<ApmStoreProduct> selectApmStoreProductList(ApmStoreProduct apmStoreProduct);

    /**
     * 查询商品列表
     *
     * @param apmStoreProduct 商品
     * @return 商品集合
     */
    List<ApmStoreProduct> selectCateProducts(ApmStoreProduct apmStoreProduct);

    /**
     * 新增商品
     *
     * @param apmStoreProduct 商品
     * @return 结果
     */
    int insertApmStoreProduct(ApmStoreProduct apmStoreProduct);

    /**
     * 修改商品
     *
     * @param apmStoreProduct 商品
     * @return 结果
     */
    int updateApmStoreProduct(ApmStoreProduct apmStoreProduct);

    /**
     * 批量删除商品
     *
     * @param ids 需要删除的商品ID
     * @return 结果
     */
    int deleteApmStoreProductByIds(Integer[] ids);

    /**
     * 删除商品信息
     *
     * @param id 商品ID
     * @return 结果
     */
    int deleteApmStoreProductById(Integer id);
}
