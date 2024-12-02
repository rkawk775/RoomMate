package com.room.mate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello from Spring Boot!";
    }
}