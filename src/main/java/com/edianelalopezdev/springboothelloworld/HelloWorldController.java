package com.edianelalopezdev.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/say-hello")
    public String sayHelloWorld() {

        return "Hello World!!!";
    }
}
