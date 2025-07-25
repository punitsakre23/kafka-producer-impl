package com.comm.kafka.producer.controller;

import com.comm.kafka.producer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        producerService.sendMessage(message);
    }
}
