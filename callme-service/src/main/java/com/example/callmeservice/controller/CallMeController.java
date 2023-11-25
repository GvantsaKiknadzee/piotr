package com.example.callmeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callme")
public class CallMeController {
    @Value("${property1}")
    private  String property1;

    @Value("${property2}")
    private  String property2;

    public CallMeController( ) {
    }

    @GetMapping("/property1")
    public String findProperty1() {
        return property1;
    }

    @GetMapping("/property2")
    public String findProperty2() {
        return property2;
    }
}
