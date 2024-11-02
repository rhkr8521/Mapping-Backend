package com.rhkr8521.mapping.common.exception;

import org.springframework.http.HttpStatus;

public class UnauthorizedException extends BaseException{
    public UnauthorizedException() {
        super(HttpStatus.UNAUTHORIZED);
    }

    public UnauthorizedException(String message) {
        super(HttpStatus.UNAUTHORIZED, message);
    }
}