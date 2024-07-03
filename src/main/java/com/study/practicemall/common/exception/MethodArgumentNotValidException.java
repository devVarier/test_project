package com.study.practicemall.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
*2024.07.03 상품등록 유효성체크시 지정한 에러코드를 나타내기 위한 테스트
*@Vaild의 경우 유효성 검증에 실패하면 MethodArgumentNotValidException 에러가 발생하면
* 검증시 지정한 메세지가 뜨게되지만 현재는 지정한 상태코드와 메세지를 테스트하기 위해 MethodArgumentNotValidException 로
* 발생시 지정 메세지와 상태코드가 나오는지 확인해본다.
* */
@Getter
@AllArgsConstructor
public class MethodArgumentNotValidException extends RuntimeException {
    private final ErrorCode errorCode;
}
