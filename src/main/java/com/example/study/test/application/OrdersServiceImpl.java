package com.example.study.test.application;

import com.example.study.global.exception.CustomException;
import com.example.study.global.exception.ErrorCode;
import com.example.study.test.dto.OrdersDto;
import com.example.study.test.entity.Orders;
import com.example.study.test.infrastructure.OrdersRepository;
import com.example.study.test.infrastructure.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrdersServiceImpl {

    private final OrdersRepository ordersRepository;
    private final TestRepository testRepository;

    public void createOrders(Long productId) {
        Orders orders = Orders.builder()
                .product(testRepository.findById(productId).orElseThrow(
                        () -> new CustomException(ErrorCode.PRDUCT_NOT_FOUND)
                ))
                .build();

        ordersRepository.save(orders);
    }

    public Orders getOrders(Long ordersId) {
        return ordersRepository.findById(ordersId).get();
    }

    public List<OrdersDto> getOrdersList() {
        Orders orders = ordersRepository.findById(1L).get();

        return ordersRepository.findAll().stream().map(OrdersDto::toDto).toList();
    }

}
