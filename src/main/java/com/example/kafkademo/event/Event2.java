package com.example.kafkademo.event;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Event2 extends BaseEvent {

    public final static String TOPIC = "event2";

    private String msg2;

    public Event2(String msg2) {
        super(TOPIC);
        this.msg2 = msg2;
    }

    public Event2() {
        super(TOPIC);
    }
}
