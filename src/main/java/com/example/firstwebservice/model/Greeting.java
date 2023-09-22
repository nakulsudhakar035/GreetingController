package com.example.firstwebservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeting {

    private int id;
    private String message;

    public Greeting(int id, String message) {
        this.id = id;
        this.message = message;
    }
}
