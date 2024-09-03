package com.example.study.test.dto;

import com.example.study.test.entity.Product;
import com.example.study.test.vo.RequestCreateUserVo;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestCreateUserDto {
    private String name;
    private int age;

    public static RequestCreateUserDto toDto(RequestCreateUserVo requestCreateUserVo) {
        return RequestCreateUserDto.builder()
                .name(requestCreateUserVo.getName())
                .age(requestCreateUserVo.getAge())
                .build();
    }

    public Product toEntity() {
        return Product.builder()
                .name(name)
                .age(age)
                .build();
    }


}
