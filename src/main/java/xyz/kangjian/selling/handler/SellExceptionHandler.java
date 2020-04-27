package xyz.kangjian.selling.handler;

import xyz.kangjian.selling.VO.ResultVO;
import xyz.kangjian.selling.exception.ResponseBankException;
import xyz.kangjian.selling.exception.SellExcption;
import xyz.kangjian.selling.exception.SellerAuthorizeExcption;
import xyz.kangjian.selling.utils.ResultVOUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kangjian
 * @date 2019/7/9 20:57
 */
@ControllerAdvice
public class SellExceptionHandler {

    //拦截登录异常
    @ExceptionHandler(value = SellerAuthorizeExcption.class)
    public ModelAndView handlerAuthorizeException(){
        return new ModelAndView("redirect:"
                .concat("sell/seller/order/list"));
    }

    @ExceptionHandler(value = SellExcption.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResultVO handlerSellerException(SellExcption e){
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handlerResponseBankException(){

    }

}
