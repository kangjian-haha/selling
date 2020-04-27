package xyz.kangjian.selling.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import xyz.kangjian.selling.form.OrderForm;
import xyz.kangjian.selling.dataobject.OrderDetail;
import xyz.kangjian.selling.dto.OrderDTO;
import xyz.kangjian.selling.enums.ResultEnum;
import xyz.kangjian.selling.exception.SellExcption;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangjian
 * @date 2019/6/24 23:14
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {

        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        orderDTO.setBuyerAddress(orderForm.getAddress());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
            }.getType());
        } catch (Exception e) {
            log.error("[对象转换] 错误, string={}", orderForm.getItems());
            throw new SellExcption(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
