package cn.saberking.jvav.apm.mall.service.impl;

import cn.saberking.jvav.apm.mall.domain.ApmStoreProduct;
import cn.saberking.jvav.apm.mall.mapper.ApmStoreProductMapper;
import cn.saberking.jvav.apm.mall.service.IApmStoreProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品Service业务层处理
 *
 * @author apm
 * @date 2020-10-06
 */
@Service
public class ApmStoreProductServiceImpl implements IApmStoreProductService {
    @Resource
    private ApmStoreProductMapper apmStoreProductMapper;

    /**
     * 查询商品
     *
     * @param id 商品ID
     * @return 商品
     */
    @Override
    public ApmStoreProduct selectApmStoreProductById(Integer id) {
        return apmStoreProductMapper.selectApmStoreProductById(id);
    }

    /**
     * 查询商品列表
     *
     * @param apmStoreProduct 商品
     * @return 商品
     */
    @Override
    public List<ApmStoreProduct> selectApmStoreProductList(ApmStoreProduct apmStoreProduct) {
        return apmStoreProductMapper.selectApmStoreProductList(apmStoreProduct);
    }

    @Override
    public List<ApmStoreProduct> selectCateProducts(ApmStoreProduct apmStoreProduct) {
        return apmStoreProductMapper.selectCateProducts(apmStoreProduct);
    }

    /**
     * 新增商品
     *
     * @param apmStoreProduct 商品
     * @return 结果
     */
    @Override
    public int insertApmStoreProduct(ApmStoreProduct apmStoreProduct) {
        return apmStoreProductMapper.insertApmStoreProduct(apmStoreProduct);
    }

    /**
     * 修改商品
     *
     * @param apmStoreProduct 商品
     * @return 结果
     */
    @Override
    public int updateApmStoreProduct(ApmStoreProduct apmStoreProduct) {
        return apmStoreProductMapper.updateApmStoreProduct(apmStoreProduct);
    }

    /**
     * 批量删除商品
     *
     * @param ids 需要删除的商品ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreProductByIds(Integer[] ids) {
        return apmStoreProductMapper.deleteApmStoreProductByIds(ids);
    }

    /**
     * 删除商品信息
     *
     * @param id 商品ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreProductById(Integer id) {
        return apmStoreProductMapper.deleteApmStoreProductById(id);
    }
}
