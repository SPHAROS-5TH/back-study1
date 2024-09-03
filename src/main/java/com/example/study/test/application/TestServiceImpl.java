package com.example.study.test.application;

import com.example.study.test.entity.Product;
import com.example.study.test.infrastructure.TestRepository;
import com.example.study.test.vo.RequestCreateUserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
    public void createUser(RequestCreateUserVo requestCreateUserVo) {
        // 비즈니스로직
        // 받은값을 엔티티로 옮겨닮고
        Product product = Product.builder()
                .name(requestCreateUserVo.getName())
                .build();
        // 엔티티를 db에 저장
        testRepository.save(product);

    }
}
