package com.example.kafkademo;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Event implements Serializable {

    private String message;

}
