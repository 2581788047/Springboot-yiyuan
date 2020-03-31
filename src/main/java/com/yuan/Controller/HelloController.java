package com.yuan.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
