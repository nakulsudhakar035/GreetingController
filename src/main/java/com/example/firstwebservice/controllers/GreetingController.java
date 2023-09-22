package com.example.firstwebservice.controllers;

import com.example.firstwebservice.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s";
    private final AtomicInteger counter = new AtomicInteger();

    @GetMapping("/greeting") // http://localhost:8080/greeting?name=world!
    public Greeting greeting(@RequestParam(value="name", defaultValue = "world!") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


}
