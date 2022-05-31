package com.shabab.firsspringapp.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {


    @KafkaListener(topics = "my-eventss", groupId = "group_id")
    public void consume(String message) throws IOException {
        System.out.println("consumed:"+message);
    }
}