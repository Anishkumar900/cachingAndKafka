package com.notifaction.notification_service.config;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConfig {

    @KafkaListener(topics = "notified", groupId = "my-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }

}
