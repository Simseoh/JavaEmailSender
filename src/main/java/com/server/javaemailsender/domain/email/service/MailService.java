package com.server.javaemailsender.domain.email.service;

import com.server.javaemailsender.domain.email.dto.response.SignUpEmailCheckMailResponse;

public interface MailService {
    SignUpEmailCheckMailResponse sendSignUpEmailCheckMail(String mail);
}
