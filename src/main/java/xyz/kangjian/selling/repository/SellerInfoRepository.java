package xyz.kangjian.selling.repository;

import xyz.kangjian.selling.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kangjian
 * @date 2019/7/8 20:59
 */

public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenid(String openid);

    SellerInfo findByUsername(String username);
}
