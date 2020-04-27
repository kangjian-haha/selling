package xyz.kangjian.selling.enums;

import lombok.Getter;

/**
 * @author kangjian
 * @date 2019/6/3 23:29
 * 商品状态
 */
@Getter
public enum  ProductStatusEnum implements CodeEnum {
    UP(0,"在架"),
    DOWN(1,"下架")

    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message= message;
    }
}
