package com.example.kafkademo.controller;

import com.example.kafkademo.event.Event1;
import com.example.kafkademo.event.Event2;
import com.example.kafkademo.event.EventPusher;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@AllArgsConstructor
public class DemoController {

    private final Random random = new Random();

    @GetMapping("/send")
    public void send(@RequestParam("msg") String msg){
        if(random.nextInt(2)==1) {
            EventPusher.push(new Event1(msg));
        }else{
            EventPusher.push(new Event2(msg));
        }
    }

}
