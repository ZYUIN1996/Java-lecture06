package com.example.HelloWorld.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // ルートURL(/)にアクセスがあったときに"Hello World"と返す

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}
