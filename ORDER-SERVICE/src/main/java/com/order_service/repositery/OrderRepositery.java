package com.order_service.repositery;

import com.order_service.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositery extends JpaRepository<OrderDetails,String> {

}
