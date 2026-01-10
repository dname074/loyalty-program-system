package com.dname074.loyalty_program_system.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class LoyaltyProgramSystemException extends RuntimeException {
    private final HttpStatus status;

    public LoyaltyProgramSystemException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
