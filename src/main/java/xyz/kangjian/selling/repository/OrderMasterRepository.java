package xyz.kangjian.selling.repository;

import xyz.kangjian.selling.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kangjian
 * @date 2019/6/23 16:51
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);


    OrderMaster findByOrderId(String orderId);
}
