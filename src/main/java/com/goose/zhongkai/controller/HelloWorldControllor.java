package com.goose.zhongkai.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllor {
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}


