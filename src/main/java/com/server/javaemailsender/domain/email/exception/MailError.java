package com.server.javaemailsender.domain.email.exception;

import com.server.javaemailsender.global.exception.CustomError;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum MailError implements CustomError {
    MAIL_CREATE_FAIL(HttpStatus.BAD_REQUEST, "cannot create mail")
    ;

    private final HttpStatus status;
    private final String message;
}
