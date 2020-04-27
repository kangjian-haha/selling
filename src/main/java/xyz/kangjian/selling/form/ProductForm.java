package xyz.kangjian.selling.form;

import lombok.Data;
import java.math.BigDecimal;

/**
 * @author kangjian
 * @date 2019/7/8 16:57
 */
@Data
public class ProductForm {


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


    /** 类目编号. */
    private Integer categoryType;


}
