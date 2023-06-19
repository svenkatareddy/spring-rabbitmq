package com.springbootrabbitmq.rabbitmq.service;

import com.springbootrabbitmq.rabbitmq.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqProducerService {

    @Value("${spring.rabbitmq.json-exchange}")
    private String exchange;


    @Value("${spring.rabbitmq.json-route-key}")
    private String routeKey;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMqProducerService.class);
    private final RabbitTemplate rabbitTemplate;

    public RabbitMqProducerService(RabbitTemplate rabbitTemplate) {

        this.rabbitTemplate = rabbitTemplate;
    }
    public void sendMessage(User user){
        LOGGER.info(String.format("Message sent %s",user.toString()));
        rabbitTemplate.convertAndSend(exchange,routeKey,user);
    }
}
