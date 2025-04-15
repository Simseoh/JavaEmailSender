package com.server.javaemailsender.domain.email.dto.request;

public record SignUpEmailCheckRequest(
        String email,
        Long enterNum
) {
}
