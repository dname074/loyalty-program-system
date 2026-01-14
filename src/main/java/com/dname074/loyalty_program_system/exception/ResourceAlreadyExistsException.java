package com.dname074.loyalty_program_system.exception;

import org.springframework.http.HttpStatus;

public class ResourceAlreadyExistsException extends LoyaltyProgramSystemException {
    public ResourceAlreadyExistsException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
