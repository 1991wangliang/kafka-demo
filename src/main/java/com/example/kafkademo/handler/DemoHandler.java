package com.example.kafkademo.handler;

import com.example.kafkademo.Event;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DemoHandler {

    @KafkaListener(groupId = "test1", topics = "topic")
    public void handler1(Event event){
        log.info("handler1:{}",event);
    }

    @KafkaListener(groupId = "test2", topics = "topic")
    public void handler2(Event event){
        log.info("handler2:{}",event);
    }
}
