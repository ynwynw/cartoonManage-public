package cn.saberking.jvav.apm.mall.domain;

import cn.saberking.jvav.apm.common.annotation.Excel;
import cn.saberking.jvav.apm.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品对象 apm_store_product
 *
 * @author apm
 * @date 2020-10-06
 */
public class ApmStoreProduct extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private Integer id;

    /**
     * 商户Id(0为总后台管理员创建,不为0的时候是商户后台创建)
     */
    @Excel(name = "商户Id", readConverterExp = "0=后台")
    private Integer merId;

    /**
     * 某种类型的商品(普通商品、二手闲置商品)
     */
    @Excel(name = "某种类型的商品", readConverterExp = "new=一手商品,old=二手闲置商品")
    private String category;

    /**
     * 商品图片
     */
    @Excel(name = "商品图片")
    private String image;

    /**
     * 轮播图
     */
    @Excel(name = "轮播图")
    private String sliderImage;

    /**
     * 商品名称
     */
    @Excel(name = "商品名称")
    private String storeName;

    /**
     * 商品简介
     */
    @Excel(name = "商品简介")
    private String storeInfo;

    /**
     * 关键字
     */
    @Excel(name = "关键字")
    private String keyword;

    /**
     * 产品条码（一维码）
     */
    @Excel(name = "产品条码")
    private String barCode;

    /**
     * 分类id
     */
    @Excel(name = "分类id", type = Excel.Type.IMPORT)
    private String cateId;

    /**
     * 分类名称
     */
    @Excel(name = "分类名称", type = Excel.Type.EXPORT)
    private String cateName;

    /**
     * 商品价格
     */
    @Excel(name = "商品价格")
    private BigDecimal price;

    /**
     * 会员价格
     */
    @Excel(name = "会员价格")
    private BigDecimal vipPrice;

    /**
     * 市场价
     */
    @Excel(name = "市场价")
    private BigDecimal otPrice;

    /**
     * 邮费
     */
    @Excel(name = "邮费")
    private BigDecimal postage;

    /**
     * 单位名
     */
    @Excel(name = "单位名")
    private String unitName;

    /**
     * 排序
     */
    @Excel(name = "排序")
    private Integer sort;

    /**
     * 销量
     */
    @Excel(name = "销量")
    private Integer sales;

    /**
     * 库存
     */
    @Excel(name = "库存")
    private Integer stock;

    /**
     * 状态（0：未上架，1：上架）
     */
    @Excel(name = "状态", readConverterExp = "0=：未上架，1：上架")
    private Integer isShow;

    /**
     * 是否热卖
     */
    @Excel(name = "是否热卖")
    private Integer isHot;

    /**
     * 是否优惠
     */
    @Excel(name = "是否优惠")
    private Integer isBenefit;

    /**
     * 是否精品
     */
    @Excel(name = "是否精品")
    private Integer isBest;

    /**
     * 是否新品
     */
    @Excel(name = "是否新品")
    private Integer isNew;

    /**
     * 产品描述
     */
    @Excel(name = "产品描述")
    private String description;

    /**
     * 添加时间
     */
    @Excel(name = "添加时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addTime;

    /**
     * 是否包邮
     */
    @Excel(name = "是否包邮")
    private Integer isPostage;

    /**
     * 是否删除
     */
    @Excel(name = "是否删除")
    private Integer isDel;

    /**
     * 商户是否代理 0不可代理1可代理
     */
    @Excel(name = "商户是否代理 0不可代理1可代理")
    private Integer merUse;

    /**
     * 获得积分
     */
    @Excel(name = "获得积分")
    private BigDecimal giveIntegral;

    /**
     * 成本价
     */
    @Excel(name = "成本价")
    private BigDecimal cost;

    /**
     * 是否优品推荐
     */
    @Excel(name = "是否优品推荐")
    private Integer isGood;

    /**
     * 虚拟销量
     */
    @Excel(name = "虚拟销量")
    private Integer ficti;

    /**
     * 浏览量
     */
    @Excel(name = "浏览量")
    private Long browse;

    /**
     * 产品二维码地址(用户小程序海报)
     */
    @Excel(name = "产品二维码地址(用户小程序海报)")
    private String codePath;

    /**
     * 淘宝京东1688类型
     */
    @Excel(name = "淘宝京东1688类型")
    private String soureLink;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    public Integer getMerId() {
        return merId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setSliderImage(String sliderImage) {
        this.sliderImage = sliderImage;
    }

    public String getSliderImage() {
        return sliderImage;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreInfo(String storeInfo) {
        this.storeInfo = storeInfo;
    }

    public String getStoreInfo() {
        return storeInfo;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public String getCateId() {
        return cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setVipPrice(BigDecimal vipPrice) {
        this.vipPrice = vipPrice;
    }

    public BigDecimal getVipPrice() {
        return vipPrice;
    }

    public void setOtPrice(BigDecimal otPrice) {
        this.otPrice = otPrice;
    }

    public BigDecimal getOtPrice() {
        return otPrice;
    }

    public void setPostage(BigDecimal postage) {
        this.postage = postage;
    }

    public BigDecimal getPostage() {
        return postage;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getSales() {
        return sales;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsBenefit(Integer isBenefit) {
        this.isBenefit = isBenefit;
    }

    public Integer getIsBenefit() {
        return isBenefit;
    }

    public void setIsBest(Integer isBest) {
        this.isBest = isBest;
    }

    public Integer getIsBest() {
        return isBest;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setIsPostage(Integer isPostage) {
        this.isPostage = isPostage;
    }

    public Integer getIsPostage() {
        return isPostage;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setMerUse(Integer merUse) {
        this.merUse = merUse;
    }

    public Integer getMerUse() {
        return merUse;
    }

    public void setGiveIntegral(BigDecimal giveIntegral) {
        this.giveIntegral = giveIntegral;
    }

    public BigDecimal getGiveIntegral() {
        return giveIntegral;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setIsGood(Integer isGood) {
        this.isGood = isGood;
    }

    public Integer getIsGood() {
        return isGood;
    }

    public void setFicti(Integer ficti) {
        this.ficti = ficti;
    }

    public Integer getFicti() {
        return ficti;
    }

    public void setBrowse(Long browse) {
        this.browse = browse;
    }

    public Long getBrowse() {
        return browse;
    }

    public void setCodePath(String codePath) {
        this.codePath = codePath;
    }

    public String getCodePath() {
        return codePath;
    }

    public void setSoureLink(String soureLink) {
        this.soureLink = soureLink;
    }

    public String getSoureLink() {
        return soureLink;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("merId", getMerId())
                .append("category", getCategory())
                .append("image", getImage())
                .append("sliderImage", getSliderImage())
                .append("storeName", getStoreName())
                .append("storeInfo", getStoreInfo())
                .append("keyword", getKeyword())
                .append("barCode", getBarCode())
                .append("cateId", getCateId())
                .append("price", getPrice())
                .append("vipPrice", getVipPrice())
                .append("otPrice", getOtPrice())
                .append("postage", getPostage())
                .append("unitName", getUnitName())
                .append("sort", getSort())
                .append("sales", getSales())
                .append("stock", getStock())
                .append("isShow", getIsShow())
                .append("isHot", getIsHot())
                .append("isBenefit", getIsBenefit())
                .append("isBest", getIsBest())
                .append("isNew", getIsNew())
                .append("description", getDescription())
                .append("addTime", getAddTime())
                .append("isPostage", getIsPostage())
                .append("isDel", getIsDel())
                .append("merUse", getMerUse())
                .append("giveIntegral", getGiveIntegral())
                .append("cost", getCost())
                .append("isGood", getIsGood())
                .append("ficti", getFicti())
                .append("browse", getBrowse())
                .append("codePath", getCodePath())
                .append("soureLink", getSoureLink())
                .toString();
    }
}
