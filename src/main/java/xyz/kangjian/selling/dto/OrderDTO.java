package xyz.kangjian.selling.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import xyz.kangjian.selling.dataobject.OrderDetail;
import xyz.kangjian.selling.enums.OrderStatusEnum;
import xyz.kangjian.selling.enums.PayStatusEnum;
import xyz.kangjian.selling.utils.EnumUtil;
import xyz.kangjian.selling.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author kangjian
 * @date 2019/6/23 21:04
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

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
    private Integer orderStatus;

    /** 支付状态,默认0未支付 */
    private Integer payStatus;

    /** 创建时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** 更新时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }

}
