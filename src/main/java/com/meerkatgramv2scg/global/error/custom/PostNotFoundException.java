package com.meerkatgramv2scg.global.error.custom;

public class PostNotFoundException extends RuntimeException {
    // 커스텀 에러는 주로 RuntimeException 상속받음
    public PostNotFoundException(String message) {
        super(message);
    }
}
