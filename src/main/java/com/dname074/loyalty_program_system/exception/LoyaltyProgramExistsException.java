package com.dname074.loyalty_program_system.exception;

import org.springframework.http.HttpStatus;

public class LoyaltyProgramExistsException extends LoyaltyProgramSystemException {
    public LoyaltyProgramExistsException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
