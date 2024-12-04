package com.room.mate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//기능 동작을 넣는 부분
@RestController
public class Controller {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello from Spring Boot!";
    }

    /*
     //찜 페이지 이동
     @GetMapping(value = "/cart")
     public void cartGet(){
        logger.info("찜 페이지로 이동");
     }
     */
}