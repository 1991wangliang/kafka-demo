package com.example.kafkademo.handler;

import com.example.kafkademo.event.Event1;
import com.example.kafkademo.event.Event2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DemoHandler {

    @KafkaListener(groupId = "handler1", topics = Event1.TOPIC)
    public void handler1(Event1 event){
        log.debug("handler1:{}",event);
    }

    @KafkaListener(groupId = "handler2", topics = Event2.TOPIC)
    public void handler2(Event2 event){
        log.debug("handler2:{}",event);
    }
}
