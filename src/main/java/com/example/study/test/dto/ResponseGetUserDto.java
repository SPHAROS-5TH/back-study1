package com.example.study.test.dto;

import com.example.study.test.entity.Product;
import com.example.study.test.vo.ResponseGetUserVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseGetUserDto {
    private String name;
    private int age;
    private Long id;

    public static ResponseGetUserDto toDto(Product product) {
        return ResponseGetUserDto.builder()
                .name(product.getName())
                .age(product.getAge())
                .id(product.getId())
                .build();
    }

    public ResponseGetUserVo toVo() {
        return ResponseGetUserVo.builder()
                .age(age)
                .id(id)
                .name(name)
                .build();
    }
}
