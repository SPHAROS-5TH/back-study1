package com.example.study.test.presentation;

import com.example.study.test.application.TestService;
import com.example.study.test.application.TestServiceImpl;
import com.example.study.test.entity.Product;
import com.example.study.test.vo.RequestCreateUserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestService testService;



    @GetMapping("/ex1")
    public String ex1() {
        return "ex1입니다.";
    }

//    @GetMapping
//    public String ex2() {
//        return "test1입니다.";
//    }

    @GetMapping("/{userId}")
    public Product getUser(@PathVariable Long userId) {
        Product product = testService.getUser(userId);

        return product;
    }

    @PostMapping
    public Void createUser(@RequestBody RequestCreateUserVo requestCreateUserVo) {
        testService.createUser(requestCreateUserVo);

        return null;
    }

}
