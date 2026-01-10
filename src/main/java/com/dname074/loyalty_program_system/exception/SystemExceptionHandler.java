package com.dname074.loyalty_program_system.exception;

import com.dname074.loyalty_program_system.dto.UserExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SystemExceptionHandler {
    @ExceptionHandler(LoyaltyProgramSystemException.class)
    public ResponseEntity<UserExceptionDto> handleException(LoyaltyProgramSystemException exception) {
        return ResponseEntity.status(exception.getStatus()).body(new UserExceptionDto(exception.getMessage(), exception.getStatus()));
    }
}
