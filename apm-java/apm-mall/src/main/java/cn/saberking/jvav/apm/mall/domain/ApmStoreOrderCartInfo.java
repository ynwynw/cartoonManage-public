package cn.saberking.jvav.apm.mall.domain;

import cn.saberking.jvav.apm.common.annotation.Excel;
import cn.saberking.jvav.apm.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 订单购物详情对象 apm_store_order_cart_info
 *
 * @author apm
 * @date 2020-10-07
 */
public class ApmStoreOrderCartInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Integer id;

    /**
     * 订单id
     */
    @Excel(name = "订单id")
    private Integer orderId;

    /**
     * 购物车id
     */
    @Excel(name = "购物车id")
    private Integer cartId;

    /**
     * 商品ID
     */
    @Excel(name = "商品ID")
    private Integer productId;

    /**
     * 购买东西的详细信息
     */
    @Excel(name = "购买东西的详细信息")
    private String cartInfo;

    /**
     * 唯一id
     */
    private String unique;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setCartInfo(String cartInfo) {
        this.cartInfo = cartInfo;
    }

    public String getCartInfo() {
        return cartInfo;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getUnique() {
        return unique;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("orderId", getOrderId())
                .append("cartId", getCartId())
                .append("productId", getProductId())
                .append("cartInfo", getCartInfo())
                .append("unique", getUnique())
                .toString();
    }
}
