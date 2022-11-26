package com.example.kafkademo.event;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Event1 extends BaseEvent {

    public final static String TOPIC = "event1";

    private String msg1;

    public Event1(String msg1) {
        super(TOPIC);
        this.msg1 = msg1;
    }

    public Event1() {
        super(TOPIC);
    }

}
