package xyz.kangjian.selling.service;

import xyz.kangjian.selling.dto.OrderDTO;

/**
 * @author kangjian
 * @date 2019/7/9 21:28
 */
public interface PushMessage {

    /**
     * 订单状态变更消息
     */
    void orderStatus(OrderDTO orderDTO);
}
