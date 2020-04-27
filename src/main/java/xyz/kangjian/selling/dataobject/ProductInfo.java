package xyz.kangjian.selling.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import xyz.kangjian.selling.enums.ProductStatusEnum;
import xyz.kangjian.selling.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author kangjian
 * @date 2019/6/3 20:50
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /** 名字. */
    private String productName;

    /** 价格. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图 */
    private String productIcon;

    /** 状态, 0正常1下架 */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /** 类目编号. */
    private Integer categoryType;

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

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }

}
