package cn.saberking.jvav.apm.common.core.domain.entity;

import cn.saberking.jvav.apm.common.annotation.Excel;
import cn.saberking.jvav.apm.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件管理对象 sys_upload_file
 *
 * @author apm
 * @date 2020-10-16
 */
public class SysUploadFile extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    @Excel(name = "标题")
    private String title;

    /**
     * 文件名
     */
    @Excel(name = "文件名")
    private String name;

    /**
     * 文件真实的名称
     */
    @Excel(name = "文件真实的名称")
    private String realName;

    /**
     * 文件虚拟路径
     */
    @Excel(name = "文件虚拟路径")
    private String url;

    /**
     * 文件磁盘路径
     */
    @Excel(name = "文件磁盘路径")
    private String realUrl;

    /**
     * 后缀
     */
    @Excel(name = "后缀")
    private String suffix;

    /**
     * 路径
     */
    @Excel(name = "路径")
    private String path;

    /**
     * 类型(0图片 1音频 2视频 3文档 4其他)
     */
    @Excel(name = "类型", readConverterExp = "0=图片,1=音频,2=视频,3=文档,4=其他")
    private Integer type;

    /**
     * 大小
     */
    @Excel(name = "大小")
    private String size;

    /**
     * 操作人
     */
    @Excel(name = "操作人")
    private String operate;

    /**
     * 文件
     */
    @JsonIgnore
    private MultipartFile file;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setRealUrl(String realUrl) {
        this.realUrl = realUrl;
    }

    public String getRealUrl() {
        return realUrl;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getOperate() {
        return operate;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("title", getTitle())
                .append("name", getName())
                .append("realName", getRealName())
                .append("url", getUrl())
                .append("realUrl", getRealUrl())
                .append("suffix", getSuffix())
                .append("path", getPath())
                .append("type", getType())
                .append("size", getSize())
                .append("operate", getOperate())
                .append("createTime", getCreateTime())
                .append("remark", getRemark())
                .toString();
    }
}
