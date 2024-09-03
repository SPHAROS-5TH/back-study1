package com.example.study.test.application;

import com.example.study.test.dto.RequestCreateUserDto;
import com.example.study.test.dto.ResponseCreateUserDto;
import com.example.study.test.dto.ResponseGetUserDto;
import com.example.study.test.entity.Product;
import com.example.study.test.infrastructure.TestRepository;
import com.example.study.test.vo.RequestCreateUserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public Product getUser(Long userId) {

        // 비즈니스 로직
        Product product = testRepository.findById(userId).get();
        // db를 조회해서 user를 찾아서 유저 정보를 리턴

        return product;
    }

    @Override
    public ResponseCreateUserDto createUser(RequestCreateUserDto requestCreateUserDto) {

        return ResponseCreateUserDto.toDto(testRepository.save(requestCreateUserDto.toEntity()));
    }

    @Override
    public List<ResponseGetUserDto> getUserList() {
        List<Product> productList = testRepository.findAll();

        return productList.stream().map(ResponseGetUserDto::toDto).toList();
    }
}
