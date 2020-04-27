package xyz.kangjian.selling.exception;

import xyz.kangjian.selling.enums.ResultEnum;
import lombok.Getter;

/**
 * @author kangjian
 * @date 2019/6/23 21:41
 */
@Getter
public class SellExcption extends RuntimeException {

    private Integer code;

    public SellExcption(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellExcption(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
