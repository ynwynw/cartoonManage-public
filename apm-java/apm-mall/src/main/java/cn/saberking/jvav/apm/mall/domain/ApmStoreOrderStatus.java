package cn.saberking.jvav.apm.mall.domain;

import cn.saberking.jvav.apm.common.annotation.Excel;
import cn.saberking.jvav.apm.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 订单操作记录对象 apm_store_order_status
 *
 * @author apm
 * @date 2020-10-07
 */
public class ApmStoreOrderStatus extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Integer id;

    /**
     * 订单id
     */
    @Excel(name = "订单id")
    private Integer oid;

    /**
     * 操作类型
     */
    @Excel(name = "操作类型")
    private String changeType;

    /**
     * 操作备注
     */
    @Excel(name = "操作备注")
    private String changeMessage;

    /**
     * 操作时间
     */
    @Excel(name = "操作时间")
    private Date changeTime;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeMessage(String changeMessage) {
        this.changeMessage = changeMessage;
    }

    public String getChangeMessage() {
        return changeMessage;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("oid", getOid())
                .append("changeType", getChangeType())
                .append("changeMessage", getChangeMessage())
                .append("changeTime", getChangeTime())
                .toString();
    }
}
