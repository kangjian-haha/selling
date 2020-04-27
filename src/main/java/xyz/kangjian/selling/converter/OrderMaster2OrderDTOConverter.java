package xyz.kangjian.selling.converter;

import xyz.kangjian.selling.dataobject.OrderMaster;
import xyz.kangjian.selling.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kangjian
 * @date 2019/6/24 15:28
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> covert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e->convert(e)).collect(Collectors.toList());
    }
}
