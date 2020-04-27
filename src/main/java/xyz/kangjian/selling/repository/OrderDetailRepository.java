package xyz.kangjian.selling.repository;

import xyz.kangjian.selling.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author kangjian
 * @date 2019/6/23 16:55
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);


}
