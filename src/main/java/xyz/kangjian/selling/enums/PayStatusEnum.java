package xyz.kangjian.selling.enums;

import lombok.Getter;

/**
 * @author kangjian
 * @date 2019/6/23 16:41
 */
@Getter
public enum PayStatusEnum implements CodeEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
