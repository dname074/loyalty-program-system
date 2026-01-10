package com.dname074.loyalty_program_system.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends LoyaltyProgramSystemException {
    public UserNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
