package cn.saberking.jvav.apm.mall.domain;

import cn.saberking.jvav.apm.common.annotation.Excel;
import cn.saberking.jvav.apm.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 商品属性对象 apm_store_product_attr
 *
 * @author apm
 * @date 2020-10-11
 */
public class ApmStoreProductAttr extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Integer id;

    /**
     * 商品ID
     */
    @Excel(name = "商品ID")
    private Integer productId;

    /**
     * 商品名称
     */
    @Excel(name = "商品名称")
    private String productName;

    /**
     * 属性名
     */
    @Excel(name = "属性名")
    private String attrName;

    /**
     * 属性值
     */
    @Excel(name = "属性值")
    private String attrValues;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrValues(String attrValues) {
        this.attrValues = attrValues;
    }

    public String getAttrValues() {
        return attrValues;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("productId", getProductId())
                .append("attrName", getAttrName())
                .append("attrValues", getAttrValues())
                .toString();
    }
}
