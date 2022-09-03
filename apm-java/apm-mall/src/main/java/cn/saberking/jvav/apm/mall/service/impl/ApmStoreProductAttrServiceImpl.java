package cn.saberking.jvav.apm.mall.service.impl;

import cn.saberking.jvav.apm.mall.domain.ApmStoreProductAttr;
import cn.saberking.jvav.apm.mall.mapper.ApmStoreProductAttrMapper;
import cn.saberking.jvav.apm.mall.service.IApmStoreProductAttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品属性Service业务层处理
 *
 * @author apm
 * @date 2020-10-11
 */
@Service
public class ApmStoreProductAttrServiceImpl implements IApmStoreProductAttrService {
    @Resource
    private ApmStoreProductAttrMapper apmStoreProductAttrMapper;

    /**
     * 查询商品属性
     *
     * @param id 商品属性ID
     * @return 商品属性
     */
    @Override
    public ApmStoreProductAttr selectApmStoreProductAttrById(Integer id) {
        return apmStoreProductAttrMapper.selectApmStoreProductAttrById(id);
    }

    /**
     * 查询商品属性列表
     *
     * @param apmStoreProductAttr 商品属性
     * @return 商品属性
     */
    @Override
    public List<ApmStoreProductAttr> selectApmStoreProductAttrList(ApmStoreProductAttr apmStoreProductAttr) {
        return apmStoreProductAttrMapper.selectApmStoreProductAttrList(apmStoreProductAttr);
    }

    @Override
    public List<ApmStoreProductAttr> selectApmProductAttrList(ApmStoreProductAttr apmStoreProductAttr) {
        return apmStoreProductAttrMapper.selectApmProductAttrList(apmStoreProductAttr);
    }

    /**
     * 新增商品属性
     *
     * @param apmStoreProductAttr 商品属性
     * @return 结果
     */
    @Override
    public int insertApmStoreProductAttr(ApmStoreProductAttr apmStoreProductAttr) {
        return apmStoreProductAttrMapper.insertApmStoreProductAttr(apmStoreProductAttr);
    }

    /**
     * 修改商品属性
     *
     * @param apmStoreProductAttr 商品属性
     * @return 结果
     */
    @Override
    public int updateApmStoreProductAttr(ApmStoreProductAttr apmStoreProductAttr) {
        return apmStoreProductAttrMapper.updateApmStoreProductAttr(apmStoreProductAttr);
    }

    /**
     * 批量删除商品属性
     *
     * @param ids 需要删除的商品属性ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreProductAttrByIds(Integer[] ids) {
        return apmStoreProductAttrMapper.deleteApmStoreProductAttrByIds(ids);
    }

    /**
     * 删除商品属性信息
     *
     * @param id 商品属性ID
     * @return 结果
     */
    @Override
    public int deleteApmStoreProductAttrById(Integer id) {
        return apmStoreProductAttrMapper.deleteApmStoreProductAttrById(id);
    }

    /**
     * 根据商品id查询商品属性
     *
     * @param id 商品id
     * @return 商品属性
     */
    @Override
    public List<ApmStoreProductAttr> selectProductAttrListByProductId(int id) {
        ApmStoreProductAttr apmStoreProductAttr = new ApmStoreProductAttr();
        apmStoreProductAttr.setProductId(id);
        return apmStoreProductAttrMapper.selectApmStoreProductAttrList(apmStoreProductAttr);
    }
}
