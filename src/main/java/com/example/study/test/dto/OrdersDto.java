package com.example.study.test.dto;

import com.example.study.test.entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDto {
    private Long id;
    private Long productId;
    private String productName;

    public static OrdersDto toDto(Orders orders) {
        return  OrdersDto.builder()
                .id(orders.getId())
                .productId(orders.getId())
                .productName(orders.getProduct().getName())
                .build();
    }



}
