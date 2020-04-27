package xyz.kangjian.selling.service;

import xyz.kangjian.selling.dto.OrderDTO;

/**
 * 买家
 * @author kangjian
 * @date 2019/6/30 20:07
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消一个订单
    OrderDTO cancelOrder(String openid, String orderId);


}
