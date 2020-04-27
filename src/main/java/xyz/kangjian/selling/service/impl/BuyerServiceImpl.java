package xyz.kangjian.selling.service.impl;

import xyz.kangjian.selling.dto.OrderDTO;
import xyz.kangjian.selling.enums.ResultEnum;
import xyz.kangjian.selling.exception.SellExcption;
import xyz.kangjian.selling.service.BuyerService;
import xyz.kangjian.selling.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kangjian
 * @date 2019/6/30 20:09
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return checkOrderOwner(openid, orderId);
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(openid, orderId);
        if (orderDTO == null) {
            log.error("[取消订单] 查不到该订单, orderId={}", orderId);
            throw new SellExcption(ResultEnum.ORDER_NOT_EXIST);
        }

        return orderService.cancel(orderDTO);
    }

    private OrderDTO checkOrderOwner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }

        //判断是否为自己的订单
        if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("[查询订单] 订单的openid不一致. openid={} , orderDTO={}", openid, orderDTO);
            throw new SellExcption(ResultEnum.ORDER_OWNER_ERROR);
        }

        return orderDTO;
    }

}
