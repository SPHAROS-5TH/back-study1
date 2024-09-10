package com.example.study.test.presentation;

import com.example.study.test.application.OrdersServiceImpl;
import com.example.study.test.dto.OrdersDto;
import com.example.study.test.entity.Orders;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {

    private final OrdersServiceImpl ordersService;

    @PostMapping("/{productId}")
    public void createOrders(@PathVariable Long productId) {
        ordersService.createOrders(productId);
    }

    @GetMapping("/{ordersId}")
    public Orders getOrders(@PathVariable Long ordersId) {
        return ordersService.getOrders(ordersId);
    }

    @GetMapping
    public List<OrdersDto> getOrdersList() {
        return ordersService.getOrdersList();
    }

}
