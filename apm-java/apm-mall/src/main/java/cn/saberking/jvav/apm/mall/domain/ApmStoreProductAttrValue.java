package cn.saberking.jvav.apm.mall.domain;

import cn.saberking.jvav.apm.common.annotation.Excel;
import cn.saberking.jvav.apm.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 商品属性值对象 apm_store_product_attr_value
 *
 * @author apm
 * @date 2020-10-11
 */
public class ApmStoreProductAttrValue extends BaseEntity {
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
     * 商品属性索引值 (attr_value|attr_value[|....])
     */
    @Excel(name = "商品属性索引值 (attr_value|attr_value[|....])")
    private String suk;

    /**
     * 属性对应的库存
     */
    @Excel(name = "属性对应的库存")
    private Integer stock;

    /**
     * 销量
     */
    @Excel(name = "销量")
    private Integer sales;

    /**
     * 属性金额
     */
    @Excel(name = "属性金额")
    private BigDecimal price;

    /**
     * 图片
     */
    @Excel(name = "图片")
    private String image;

    /**
     * 唯一值
     */
    @Excel(name = "唯一值")
    private String unique;

    /**
     * 成本价
     */
    @Excel(name = "成本价")
    private BigDecimal cost;

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

    public void setSuk(String suk) {
        this.suk = suk;
    }

    public String getSuk() {
        return suk;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getSales() {
        return sales;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getUnique() {
        return unique;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("productId", getProductId())
                .append("suk", getSuk())
                .append("stock", getStock())
                .append("sales", getSales())
                .append("price", getPrice())
                .append("image", getImage())
                .append("unique", getUnique())
                .append("cost", getCost())
                .toString();
    }
}
