package com.order_service.controller;

import com.order_service.entity.OrderDetails;
import com.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {



    private final OrderService orderService;

    public OrderController (OrderService orderService){
        this.orderService = orderService;
    }

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("test/{userName}")
    public String test(@PathVariable String userName){

        kafkaTemplate.send("notified",userName);

        return "Notified user name "+userName;
    }

    @PostMapping
    public ResponseEntity<OrderDetails> createOrder(@RequestBody OrderDetails orderDetails){
            return new ResponseEntity<>(orderService.createOrder(orderDetails), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDetails> getOrderByOrderId(@PathVariable String id) throws InterruptedException {
        return new ResponseEntity<>(orderService.getOrderById(id), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<OrderDetails>> getAllOrder() throws InterruptedException {
        return new ResponseEntity<>(orderService.getAllOrder(), HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<OrderDetails> updateOrderDetails(@RequestBody OrderDetails orderDetails){
        return new ResponseEntity<>(orderService.updateOrderDetails(orderDetails),HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> createOrder(@PathVariable String id){
        orderService.deleteOrderById(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }


}
