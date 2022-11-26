package com.example.kafkademo.event;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EventRegister implements ApplicationRunner {

    private final KafkaTemplate<String, BaseEvent> template;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        EventPusher.getInstance().init(template);
    }
}
