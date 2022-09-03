package cn.saberking.jvav.apm.mall.domain;

import cn.saberking.jvav.apm.common.annotation.Excel;
import cn.saberking.jvav.apm.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单对象 apm_store_order
 *
 * @author apm
 * @date 2020-10-06
 */
public class ApmStoreOrder extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
    private Integer id;

    /**
     * 订单号
     */
    @Excel(name = "订单号")
    private String orderId;

    /**
     * 额外订单号
     */
    private String extendOrderId;

    /**
     * 用户id
     */
    @Excel(name = "用户ID")
    private Integer userId;

    /**
     * 用户姓名
     */
    @Excel(name = "用户姓名")
    private String realName;

    /**
     * 用户电话
     */
    @Excel(name = "用户电话")
    private String userPhone;

    /**
     * 详细地址
     */
    @Excel(name = "详细地址")
    private String userAddress;

    /**
     * 购物车id
     */
    @Excel(name = "购物车ID")
    private String cartId;

    /**
     * 运费金额
     */
    @Excel(name = "运费金额")
    private BigDecimal freightPrice;

    /**
     * 订单商品总数
     */
    @Excel(name = "订单商品总数")
    private Integer totalNum;

    /**
     * 订单总价
     */
    @Excel(name = "订单总价")
    private BigDecimal totalPrice;

    /**
     * 邮费
     */
    @Excel(name = "邮费")
    private BigDecimal totalPostage;

    /**
     * 实际支付金额
     */
    @Excel(name = "实际支付金额")
    private BigDecimal payPrice;

    /**
     * 支付邮费
     */
    @Excel(name = "支付邮费")
    private BigDecimal payPostage;

    /**
     * 抵扣金额
     */
    private BigDecimal deductionPrice;

    /**
     * 优惠券id
     */
    private Integer couponId;

    /**
     * 优惠券金额
     */
    private BigDecimal couponPrice;

    /**
     * 支付状态（0已支付 1未支付）
     */
    @Excel(name = "支付状态", readConverterExp = "0=已支付,1=未支付")
    private Integer paid;

    /**
     * 支付时间
     */
    @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date payTime;

    /**
     * 支付方式
     */
    @Excel(name = "支付方式")
    private String payType;

    /**
     * 创建时间
     */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date addTime;

    /**
     * 订单状态（-1申请退款 -2退货成功 0待发货 1待收货 2已收货 3待评价）
     */
    @Excel(name = "订单状态", readConverterExp = "-1=申请退款,-2=退货成功,0=待发货,1=待收货,2=已收货,3=待评价")
    private Integer status;

    /**
     * 退货状态（0未退款 1申请中 2已退款）
     */
    @Excel(name = "退货状态", readConverterExp = "0=未退款,1=申请中,2=已退款")
    private Integer refundStatus;

    /**
     * 退款图片
     */
    @Excel(name = "退款图片")
    private String refundReasonWapImg;

    /**
     * 退款用户说明
     */
    @Excel(name = "退款用户说明")
    private String refundReasonWapExplain;

    /**
     * 退款时间
     */
    @Excel(name = "退款时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date refundReasonTime;

    /**
     * 前台退款原因
     */
    @Excel(name = "前台退款原因")
    private String refundReasonWap;

    /**
     * 不退款的理由
     */
    @Excel(name = "不退款的理由")
    private String refundReason;

    /**
     * 退款金额
     */
    @Excel(name = "退款金额")
    private BigDecimal refundPrice;

    /**
     * 快递公司编号
     */
    @Excel(name = "快递公司编号")
    private String deliverySn;

    /**
     * 快递名称/送货人姓名
     */
    @Excel(name = "快递名称/送货人姓名")
    private String deliveryName;

    /**
     * 发货类型
     */
    @Excel(name = "发货类型")
    private String deliveryType;

    /**
     * 快递单号/手机号
     */
    @Excel(name = "快递单号/手机号")
    private String deliveryId;

    /**
     * 消费赚取积分
     */
    private BigDecimal gainIntegral;

    /**
     * 使用积分
     */
    private BigDecimal useIntegral;

    /**
     * 给用户退了多少积分
     */
    private BigDecimal backIntegral;

    /**
     * 备注
     */
    @Excel(name = "备注")
    private String mark;

    /**
     * 是否删除
     */
    @Excel(name = "是否删除", readConverterExp = "0=存在,1=已删除")
    private Integer isDel;

    /**
     * 唯一id(md5加密)类似id
     */
    private String unique;

    /**
     * $column.columnComment
     */
    private Integer isMerCheck;

    /**
     * 成本价
     */
    @Excel(name = "成本价")
    private BigDecimal cost;

    /**
     * 核销码
     */
    @Excel(name = "核销码")
    private String verifyCode;

    /**
     * 门店id
     */
    private Long storeId;

    /**
     * 配送方式 1=快递 ，2=门店自提
     */
    private Integer shippingType;

    /**
     * 支付渠道(0微信公众号1微信小程序)
     */
    private Integer isChannel;

    /**
     * $column.columnComment
     */
    private Integer isRemind;

    /**
     * $column.columnComment
     */
    private Integer isSystemDel;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setExtendOrderId(String extendOrderId) {
        this.extendOrderId = extendOrderId;
    }

    public String getExtendOrderId() {
        return extendOrderId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPostage(BigDecimal totalPostage) {
        this.totalPostage = totalPostage;
    }

    public BigDecimal getTotalPostage() {
        return totalPostage;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPostage(BigDecimal payPostage) {
        this.payPostage = payPostage;
    }

    public BigDecimal getPayPostage() {
        return payPostage;
    }

    public void setDeductionPrice(BigDecimal deductionPrice) {
        this.deductionPrice = deductionPrice;
    }

    public BigDecimal getDeductionPrice() {
        return deductionPrice;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return payType;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundReasonWapImg(String refundReasonWapImg) {
        this.refundReasonWapImg = refundReasonWapImg;
    }

    public String getRefundReasonWapImg() {
        return refundReasonWapImg;
    }

    public void setRefundReasonWapExplain(String refundReasonWapExplain) {
        this.refundReasonWapExplain = refundReasonWapExplain;
    }

    public String getRefundReasonWapExplain() {
        return refundReasonWapExplain;
    }

    public void setRefundReasonTime(Date refundReasonTime) {
        this.refundReasonTime = refundReasonTime;
    }

    public Date getRefundReasonTime() {
        return refundReasonTime;
    }

    public void setRefundReasonWap(String refundReasonWap) {
        this.refundReasonWap = refundReasonWap;
    }

    public String getRefundReasonWap() {
        return refundReasonWap;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundPrice(BigDecimal refundPrice) {
        this.refundPrice = refundPrice;
    }

    public BigDecimal getRefundPrice() {
        return refundPrice;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setGainIntegral(BigDecimal gainIntegral) {
        this.gainIntegral = gainIntegral;
    }

    public BigDecimal getGainIntegral() {
        return gainIntegral;
    }

    public void setUseIntegral(BigDecimal useIntegral) {
        this.useIntegral = useIntegral;
    }

    public BigDecimal getUseIntegral() {
        return useIntegral;
    }

    public void setBackIntegral(BigDecimal backIntegral) {
        this.backIntegral = backIntegral;
    }

    public BigDecimal getBackIntegral() {
        return backIntegral;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    public String getUnique() {
        return unique;
    }

    public void setIsMerCheck(Integer isMerCheck) {
        this.isMerCheck = isMerCheck;
    }

    public Integer getIsMerCheck() {
        return isMerCheck;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setShippingType(Integer shippingType) {
        this.shippingType = shippingType;
    }

    public Integer getShippingType() {
        return shippingType;
    }

    public void setIsChannel(Integer isChannel) {
        this.isChannel = isChannel;
    }

    public Integer getIsChannel() {
        return isChannel;
    }

    public void setIsRemind(Integer isRemind) {
        this.isRemind = isRemind;
    }

    public Integer getIsRemind() {
        return isRemind;
    }

    public void setIsSystemDel(Integer isSystemDel) {
        this.isSystemDel = isSystemDel;
    }

    public Integer getIsSystemDel() {
        return isSystemDel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("orderId", getOrderId())
                .append("extendOrderId", getExtendOrderId())
                .append("userId", getUserId())
                .append("realName", getRealName())
                .append("userPhone", getUserPhone())
                .append("userAddress", getUserAddress())
                .append("cartId", getCartId())
                .append("freightPrice", getFreightPrice())
                .append("totalNum", getTotalNum())
                .append("totalPrice", getTotalPrice())
                .append("totalPostage", getTotalPostage())
                .append("payPrice", getPayPrice())
                .append("payPostage", getPayPostage())
                .append("deductionPrice", getDeductionPrice())
                .append("couponId", getCouponId())
                .append("couponPrice", getCouponPrice())
                .append("paid", getPaid())
                .append("payTime", getPayTime())
                .append("payType", getPayType())
                .append("addTime", getAddTime())
                .append("status", getStatus())
                .append("refundStatus", getRefundStatus())
                .append("refundReasonWapImg", getRefundReasonWapImg())
                .append("refundReasonWapExplain", getRefundReasonWapExplain())
                .append("refundReasonTime", getRefundReasonTime())
                .append("refundReasonWap", getRefundReasonWap())
                .append("refundReason", getRefundReason())
                .append("refundPrice", getRefundPrice())
                .append("deliverySn", getDeliverySn())
                .append("deliveryName", getDeliveryName())
                .append("deliveryType", getDeliveryType())
                .append("deliveryId", getDeliveryId())
                .append("gainIntegral", getGainIntegral())
                .append("useIntegral", getUseIntegral())
                .append("backIntegral", getBackIntegral())
                .append("mark", getMark())
                .append("isDel", getIsDel())
                .append("unique", getUnique())
                .append("remark", getRemark())
                .append("isMerCheck", getIsMerCheck())
                .append("cost", getCost())
                .append("verifyCode", getVerifyCode())
                .append("storeId", getStoreId())
                .append("shippingType", getShippingType())
                .append("isChannel", getIsChannel())
                .append("isRemind", getIsRemind())
                .append("isSystemDel", getIsSystemDel())
                .toString();
    }
}
