package com.example.study.test.application;


import com.example.study.test.entity.Product;
import com.example.study.test.vo.RequestCreateUserVo;

public interface TestService {
    public Product getUser(Long userId);

    public void createUser(RequestCreateUserVo requestCreateUserVo);
}
