package com.example.kafkademo.event;

import lombok.Getter;

import java.io.Serializable;
import java.util.Calendar;


public abstract class BaseEvent implements Serializable {

    @Getter
    private final String topic;

    @Getter
    private final long timestamps;

    public BaseEvent(String topic) {
        this.topic = topic;
        this.timestamps = Calendar.getInstance().getTimeInMillis();
    }
}
