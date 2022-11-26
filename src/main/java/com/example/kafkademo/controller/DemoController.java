package com.example.kafkademo.controller;

import com.example.kafkademo.Event;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoController {

    private final KafkaTemplate<String, Event> template;

    @GetMapping("/send")
    public void send(@RequestParam("msg") String msg){
        template.send("topic",new Event(msg));
    }

}
