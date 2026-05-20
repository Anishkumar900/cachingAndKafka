package com.order_service.serviceImp;

import com.order_service.entity.OrderDetails;
import com.order_service.repositery.OrderRepositery;
import com.order_service.service.OrderService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImp implements OrderService {

    private final OrderRepositery orderRepositery;

    public OrderServiceImp(OrderRepositery orderRepositery) {
        this.orderRepositery = orderRepositery;
    }

    @Override
    @CacheEvict(value = "order", allEntries = true)
    public OrderDetails createOrder(OrderDetails orderDetails) {
        orderDetails.setDate(LocalDate.now());
        return orderRepositery.save(orderDetails);
    }

    @Override
    @Cacheable(value = "order", key = "#orderId")
    public OrderDetails getOrderById(String orderId) throws InterruptedException {
        Thread thread=new Thread();
        Thread.sleep(5000);
        return orderRepositery.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    @Cacheable(value = "order", key = "'order_frequency'")
    public List<OrderDetails> getAllOrder() throws InterruptedException {
        Thread thread=new Thread();
        Thread.sleep(5000);
        return orderRepositery.findAll();
    }



    @Override
    @CacheEvict(value = "order", key = "#orderId")
    public void deleteOrderById(String orderId) {
        orderRepositery.deleteById(orderId);
    }

    @Override
    @CachePut(value = "order", key = "#orderDetails.orderId")
    public OrderDetails updateOrderDetails(OrderDetails orderDetails) {

        orderRepositery.findById(orderDetails.getOrderId())
                .orElseThrow(() -> new RuntimeException("Order not found!"));

        return orderRepositery.save(orderDetails);
    }

}
