package xyz.kangjian.selling.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品详情
 * @author kangjian
 * @date 2019/6/23 10:29
 */
@Data
public class ProductInfoVO  implements Serializable {

    private static final long serialVersionUID = 4298075798822166024L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
