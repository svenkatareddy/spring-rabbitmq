package com.springbootrabbitmq.rabbitmq.controller;

import com.springbootrabbitmq.rabbitmq.dto.User;
import com.springbootrabbitmq.rabbitmq.service.RabbitMqProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {

    RabbitMqProducerService rabbitMqProducerService;
    public RabbitMqController(RabbitMqProducerService rabbitMqProducerService) {
        this.rabbitMqProducerService = rabbitMqProducerService;
    }

    @PostMapping("/user")
    public ResponseEntity<String> publishMessage(@RequestBody User user){
        rabbitMqProducerService.sendMessage(user);
        return ResponseEntity.ok("Sent successfully");
    }
}
