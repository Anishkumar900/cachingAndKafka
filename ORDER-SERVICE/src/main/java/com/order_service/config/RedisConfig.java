package com.order_service.config;

//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import com.order_service.entity.OrderDetails;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//import redis.clients.jedis.JedisPoolConfig;

import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableRedisRepositories
public class RedisConfig {

//    @Bean
//    public JedisConnectionFactory connectionFactory() {
//        RedisStandaloneConfiguration config =
//                new RedisStandaloneConfiguration("localhost", 6379);
//
//        JedisPoolConfig pool = new JedisPoolConfig();
//        pool.setMaxTotal(10);
//        pool.setMaxIdle(5);
//        pool.setMinIdle(1);
//
//        JedisClientConfiguration jedisClientConfiguration =
//                JedisClientConfiguration.builder()
//                        .usePooling().poolConfig(pool)
//                        .build();
//
//        return new JedisConnectionFactory(config, jedisClientConfiguration);
//    }
//
//    @Bean
//    public RedisTemplate<String, OrderDetails> orderRedisTemplate(JedisConnectionFactory connectionFactory) {
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
//        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
//
//        GenericJackson2JsonRedisSerializer serializer =
//                new GenericJackson2JsonRedisSerializer(mapper);
//
//        RedisTemplate<String, OrderDetails> template = new RedisTemplate<>();
//        template.setConnectionFactory(connectionFactory);
//
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(serializer);
//
//        template.afterPropertiesSet();
//        return template;
//    }
//
//
//    @Bean
//    public RedisTemplate<String, String> scoreRedisTemplate(JedisConnectionFactory connectionFactory) {
//
//        RedisTemplate<String, String> template = new RedisTemplate<>();
//        template.setConnectionFactory(connectionFactory);
//
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new StringRedisSerializer());
//
//        template.afterPropertiesSet();
//        return template;
//    }


}
