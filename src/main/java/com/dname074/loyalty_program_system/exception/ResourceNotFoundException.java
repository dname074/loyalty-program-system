package com.dname074.loyalty_program_system.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends LoyaltyProgramSystemException {
    public ResourceNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
