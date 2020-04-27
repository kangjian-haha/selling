package xyz.kangjian.selling.dataobject;

import xyz.kangjian.selling.enums.OrderStatusEnum;
import xyz.kangjian.selling.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author kangjian
 * @date 2019/6/23 16:27
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** 订单ID. */
    @Id
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家手机号码 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信Openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态,默认未0新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态,默认0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time", updatable = false)
    @Generated(GenerationTime.INSERT)
    private Date createTime;

    /** 更新时间 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_time")
    @Generated(GenerationTime.ALWAYS)
    private Date updateTime;





}
