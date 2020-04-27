package xyz.kangjian.selling.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author kangjian
 * @date 2019/6/23 16:46
 */
@Entity
@DynamicUpdate
@Data
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单ID. */
    private String orderId;

    /** 商品ID. */
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 商品价格 */
    private BigDecimal productPrice;

    /** 商品数量 */
    private Integer productQuantity;

    /** 商品小图 */
    private String productIcon;


}
