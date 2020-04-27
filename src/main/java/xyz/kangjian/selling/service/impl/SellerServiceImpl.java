package xyz.kangjian.selling.service.impl;

import xyz.kangjian.selling.dataobject.SellerInfo;
import xyz.kangjian.selling.repository.SellerInfoRepository;
import xyz.kangjian.selling.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kangjian
 * @date 2019/7/8 21:12
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }

}
