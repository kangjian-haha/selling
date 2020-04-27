package xyz.kangjian.selling.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品(包含类目)
 *
 * @author kangjian
 * @date 2019/6/23 10:21
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = -237980216324699883L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categorytype;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
