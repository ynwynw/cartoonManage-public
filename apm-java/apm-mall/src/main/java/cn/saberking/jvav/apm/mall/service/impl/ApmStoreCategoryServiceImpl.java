package cn.saberking.jvav.apm.mall.service.impl;

import cn.saberking.jvav.apm.mall.common.Constant;
import cn.saberking.jvav.apm.mall.domain.ApmStoreCategory;
import cn.saberking.jvav.apm.mall.enumeration.ProductCategoryIsDel;
import cn.saberking.jvav.apm.mall.mapper.ApmStoreCategoryMapper;
import cn.saberking.jvav.apm.mall.service.IApmStoreCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品分类Service业务层处理
 *
 * @author apm
 * @date 2020-10-06
 */
@Service
public class ApmStoreCategoryServiceImpl implements IApmStoreCategoryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApmStoreCategoryServiceImpl.class);

    @Resource
    private ApmStoreCategoryMapper apmStoreCategoryMapper;

    /**
     * 查询商品分类
     *
     * @param id 商品分类ID
     * @return 商品分类
     */
    @Override
    public ApmStoreCategory selectApmStoreCategoryById(Integer id) {
        return apmStoreCategoryMapper.selectApmStoreCategoryById(id);
    }

    /**
     * 查询商品分类列表
     *
     * @param apmStoreCategory 商品分类
     * @return 商品分类
     */
    @Override
    public List<ApmStoreCategory> selectApmStoreCategoryList(ApmStoreCategory apmStoreCategory) {
        return apmStoreCategoryMapper.selectListAddParentName(apmStoreCategory);
    }

    /**
     * 新增商品分类
     *
     * @param apmStoreCategory 商品分类
     * @return 结果
     */
    @Override
    public int insertApmStoreCategory(ApmStoreCategory apmStoreCategory) {
        return apmStoreCategoryMapper.insertApmStoreCategory(apmStoreCategory);
    }

    /**
     * 修改商品分类
     *
     * @param apmStoreCategory 商品分类
     * @return 结果
     */
    @Override
    public int updateApmStoreCategory(ApmStoreCategory apmStoreCategory) {
        return apmStoreCategoryMapper.updateApmStoreCategory(apmStoreCategory);
    }

    /**
     * 批量删除商品分类
     *
     * @param ids 需要删除的商品分类ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreCategoryByIds(Integer[] ids) {
        return apmStoreCategoryMapper.deleteApmStoreCategoryByIds(ids);
    }

    /**
     * 删除商品分类信息
     *
     * @param id 商品分类ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreCategoryById(Integer id) {
        return apmStoreCategoryMapper.deleteApmStoreCategoryById(id);
    }

    /**
     * 获取有层级的分类数据
     *
     * @return 分类集合
     */
    @Override
    public List<ApmStoreCategory> selectApmStoreCategoryList() {
        //设置查询条件
        ApmStoreCategory apmStoreCategory = new ApmStoreCategory();
        apmStoreCategory.setIsDel(ProductCategoryIsDel.NO.getCode());
        //查询所有未删除的商品分类
        List<ApmStoreCategory> categoryList = apmStoreCategoryMapper.selectApmStoreCategoryList(apmStoreCategory);
        //打印
        LOGGER.info("商品分类数据为：{}", categoryList);
        //创建分类集合预存储带层级的分类
        List<ApmStoreCategory> categories = new ArrayList<>();
        categoryList.forEach(c -> {
            if (c.getPid().equals(Constant.PRODUCT_CATEGORY_ROOT_PID)) {
                //设置父分类名称
                c.setParentName(Constant.PRODUCT_CATEGORY_ROOT_NAME);
                //加入一级分类
                categories.add(c);
                //查找二级分类
                findSub(c, categoryList);
            }
        });
        LOGGER.info("当前商品分类数据为：{}", categories);
        return categories;
    }

    /**
     * 获取有层级的子分类数据
     * @param current 当前分类
     * @param categoryList 需要遍历的所有分类
     */
    private void findSub(ApmStoreCategory current, List<ApmStoreCategory> categoryList) {
        categoryList.forEach(c -> {
            //如果当前分类的父分类是传入的分类
            if (c.getPid().equals(current.getId())) {
                //如果传入的父分类的子分类集合为空
                if (current.getSubCategoryList() == null) {
                    //设置子分类集合
                    List<ApmStoreCategory> subCateGoryList = new ArrayList<>();
                    current.setSubCategoryList(subCateGoryList);
                }
                //设置父分类名称
                c.setParentName(current.getCateName());
                //添加子分类
                current.getSubCategoryList().add(c);
                //递归遍历子分类的分类
                findSub(c, categoryList);
            }
        });
    }

    /**
     * 条件查询所有的非一级分类
     * @param apmStoreCategory 封装查询条件参数
     * @return 结果
     */
    @Override
    public List<ApmStoreCategory> selectSecondCategoryList(ApmStoreCategory apmStoreCategory) {
        //查询分类
        List<ApmStoreCategory> categoryList = selectApmStoreCategoryList(apmStoreCategory);
        //创建分类集合预存储带层级的分类
        List<ApmStoreCategory> categories = new ArrayList<>();
        //遍历
        categoryList.forEach(c -> {
            //如果当前分类不是一级分类
            if (!c.getPid().equals(Constant.PRODUCT_CATEGORY_ROOT_PID)) {
                //加入当前分类
                categories.add(c);
            }
        });
        LOGGER.info("二级分类信息如下：{}", categoryList);
        return categories;
    }
}
