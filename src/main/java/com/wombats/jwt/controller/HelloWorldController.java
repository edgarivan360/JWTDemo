package com.wombats.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/demo")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new StringBuilder("Hello")
                .append(" ")
                .append(name)
                .append("!!")
                .toString();
    }

}
