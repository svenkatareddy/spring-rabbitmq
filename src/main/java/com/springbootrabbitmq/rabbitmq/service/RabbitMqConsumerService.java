package com.springbootrabbitmq.rabbitmq.service;

import com.springbootrabbitmq.rabbitmq.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqConsumerService {
    private static final Logger log = LoggerFactory.getLogger(RabbitMqConsumerService.class);
    @RabbitListener(queues="${spring.rabbitmq.json-queue}")
    public void consumeMessages(User user){
        log.info(String.format("Message received %s",user.toString()));
    }
}
