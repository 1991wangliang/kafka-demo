package com.example.kafkademo.event;

import lombok.Getter;

import java.io.Serializable;


public abstract class BaseEvent implements Serializable {

    @Getter
    private final String topic;

    public BaseEvent(String topic) {
        this.topic = topic;
    }
}
