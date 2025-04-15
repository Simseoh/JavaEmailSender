package com.server.javaemailsender.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum GlobalError implements CustomError {
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "Input Value Wrong");

    private final HttpStatus status;
    private final String message;
}
