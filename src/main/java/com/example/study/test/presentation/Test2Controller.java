package com.example.study.test.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class Test2Controller {

    @GetMapping("/ex1")
    public String ex1() {
        return "test2의 ex1입니다.";
    }

    @GetMapping
    public String ex2() {
        return "test2입니다.";
    }
}
