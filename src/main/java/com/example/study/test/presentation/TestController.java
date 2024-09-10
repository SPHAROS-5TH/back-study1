package com.example.study.test.presentation;

import com.example.study.test.application.TestService;
import com.example.study.test.application.TestServiceImpl;
import com.example.study.test.dto.RequestCreateUserDto;
import com.example.study.test.dto.ResponseCreateUserDto;
import com.example.study.test.dto.ResponseGetUserDto;
import com.example.study.test.entity.Product;
import com.example.study.test.vo.RequestCreateUserVo;
import com.example.study.test.vo.ResponseCreateUserVo;
import com.example.study.test.vo.ResponseGetUserVo;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

            Product product = testService.getUser(userId); // Product


        return product;
    }

    @PostMapping
    public ResponseCreateUserVo createUser(@RequestBody RequestCreateUserVo requestCreateUserVo) {

        return testService.createUser(RequestCreateUserDto.toDto(requestCreateUserVo)).toVo();


    }

    @GetMapping
    public List<ResponseGetUserVo> getUserList() {

        return testService.getUserList().stream().map(ResponseGetUserDto::toVo).toList();

    }

}
