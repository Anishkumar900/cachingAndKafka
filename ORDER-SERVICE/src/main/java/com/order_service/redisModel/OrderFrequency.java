package com.order_service.redisModel;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.data.redis.core.RedisHash;

//@RedisHash("OrderFrequency")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderFrequency {

    @Id
    private String orderId;
    private long count;
}

