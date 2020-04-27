package xyz.kangjian.selling.service;

import xyz.kangjian.selling.dataobject.SellerInfo;

/**
 * 卖家端
 * @author kangjian
 * @date 2019/7/8 21:10
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
