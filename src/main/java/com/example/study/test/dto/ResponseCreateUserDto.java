package com.example.study.test.dto;

import com.example.study.test.entity.Product;
import com.example.study.test.vo.ResponseCreateUserVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCreateUserDto {
    private Long id;
    private String name;
    private int age;

    public static ResponseCreateUserDto toDto(Product product) {
        return ResponseCreateUserDto.builder()
                .id(product.getId())
                .name(product.getName())
                .age(product.getAge())
                .build();
    }

    public ResponseCreateUserVo toVo() {
        return ResponseCreateUserVo.builder()
                .userId(id)
//                .age(age)
                .name(name)
                .build();
    }
}
