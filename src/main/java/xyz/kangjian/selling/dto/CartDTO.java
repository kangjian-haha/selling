package xyz.kangjian.selling.dto;

import lombok.Data;

/**
 * @author kangjian
 * @date 2019/6/23 22:18
 */
@Data
public class CartDTO {

    /** 商品ID. */
    private String productId;

    /** 数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
