package com.example.study.test.application;


import com.example.study.test.dto.RequestCreateUserDto;
import com.example.study.test.dto.ResponseCreateUserDto;
import com.example.study.test.dto.ResponseGetUserDto;
import com.example.study.test.entity.Product;
import com.example.study.test.vo.RequestCreateUserVo;

import java.util.List;

public interface TestService {
    public Product getUser(Long userId);

    public ResponseCreateUserDto createUser(RequestCreateUserDto requestCreateUserDto);

    public List<ResponseGetUserDto> getUserList();
}
