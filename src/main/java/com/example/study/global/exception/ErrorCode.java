package com.example.study.global.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    // 400
    TEST_ERROR_CODE(400, "ERROR-001", "올바르지 않은 입력값입니다."),
    PRDUCT_NOT_FOUND(400, "PRODUCT-001", "해당 제품을 찾을수 없습니다."),

    // 500
    INTERNAL_SERVER_ERROR(500, "SERVER-001", "이건 돼야해");


    private final int status;
    private final String code;
    private final String Description;

    ErrorCode(int status, String code, String Description) {
        this.status = status;
        this.code = code;
        this.Description = Description;
    }
}