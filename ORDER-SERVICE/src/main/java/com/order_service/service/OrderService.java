package com.order_service.service;

import com.order_service.entity.OrderDetails;

import java.util.List;

public interface OrderService {
    OrderDetails createOrder(OrderDetails orderDetails);
    OrderDetails getOrderById(String orderId) throws InterruptedException;
    List<OrderDetails> getAllOrder() throws InterruptedException;
    void deleteOrderById(String OrderId);
    OrderDetails updateOrderDetails(OrderDetails orderDetails);
}
