package com.study.practicemall.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ErrorCode {

    /*2024.07.03 상품등록 유효성체크시 지정한 에러코드를 나타내기 위한 테스트*/
    INTERNAL_SERVER_ERROR(500, "상품코드를 입력하세요.");

    private final int statusCode;
    private final String message;
}

