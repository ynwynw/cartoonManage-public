package cn.saberking.jvav.apm.mall.domain;

import cn.saberking.jvav.apm.common.annotation.Excel;
import cn.saberking.jvav.apm.common.core.domain.TreeEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;
import java.util.List;

/**
 * 商品分类对象 apm_store_category
 *
 * @author apm
 * @date 2020-10-06
 */
public class ApmStoreCategory extends TreeEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 商品分类表ID
     */
    private Integer id;

    /**
     * 父id
     */
    @Excel(name = "父id")
    private Integer pid;

    /**
     * 分类名称
     */
    @Excel(name = "分类名称")
    private String cateName;

    /**
     * 排序
     */
    @Excel(name = "排序")
    private Integer sort;

    /**
     * 图标
     */
    @Excel(name = "图标")
    private String pic;

    /**
     * 是否推荐
     */
    @Excel(name = "是否推荐")
    private Integer isShow;

    /**
     * 添加时间
     */
    @Excel(name = "添加时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addTime;

    /**
     * 删除状态
     */
    @Excel(name = "删除状态")
    private Integer isDel;

    /**
     * 子分类
     */
    private List<ApmStoreCategory> subCategoryList;

    /**
     * 该分类下的所有商品
     */
    private List<ApmStoreProduct> productList;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getCateName() {
        return cateName;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSort() {
        return sort;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return pic;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public List<ApmStoreCategory> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(List<ApmStoreCategory> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }

    public List<ApmStoreProduct> getProductList() {
        return productList;
    }

    public void setProductList(List<ApmStoreProduct> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("pid", getPid())
                .append("cateName", getCateName())
                .append("sort", getSort())
                .append("pic", getPic())
                .append("isShow", getIsShow())
                .append("addTime", getAddTime())
                .append("isDel", getIsDel())
                .toString();
    }
}
