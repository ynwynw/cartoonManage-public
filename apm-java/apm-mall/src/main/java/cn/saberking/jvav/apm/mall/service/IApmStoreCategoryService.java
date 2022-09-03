package cn.saberking.jvav.apm.mall.service;

import cn.saberking.jvav.apm.mall.domain.ApmStoreCategory;

import java.util.List;

/**
 * 商品分类Service接口
 *
 * @author apm
 * @date 2020-10-06
 */
public interface IApmStoreCategoryService {
    /**
     * 查询商品分类
     *
     * @param id 商品分类ID
     * @return 商品分类
     */
    ApmStoreCategory selectApmStoreCategoryById(Integer id);

    /**
     * 查询商品分类列表
     *
     * @param apmStoreCategory 商品分类
     * @return 商品分类集合
     */
    List<ApmStoreCategory> selectApmStoreCategoryList(ApmStoreCategory apmStoreCategory);

    /**
     * 新增商品分类
     *
     * @param apmStoreCategory 商品分类
     * @return 结果
     */
    int insertApmStoreCategory(ApmStoreCategory apmStoreCategory);

    /**
     * 修改商品分类
     *
     * @param apmStoreCategory 商品分类
     * @return 结果
     */
    int updateApmStoreCategory(ApmStoreCategory apmStoreCategory);

    /**
     * 批量删除商品分类
     *
     * @param ids 需要删除的商品分类ID
     * @return 结果
     */
    int deleteApmStoreCategoryByIds(Integer[] ids);

    /**
     * 删除商品分类信息
     *
     * @param id 商品分类ID
     * @return 结果
     */
    int deleteApmStoreCategoryById(Integer id);

    /**
     * 获取有层级的菜单数据
     *
     * @return 菜单
     */
    List<ApmStoreCategory> selectApmStoreCategoryList();

    /**
     * 条件查询所有的非一级分类
     * @param apmStoreCategory 封装查询条件参数
     * @return 结果
     */
    List<ApmStoreCategory> selectSecondCategoryList(ApmStoreCategory apmStoreCategory);
}
