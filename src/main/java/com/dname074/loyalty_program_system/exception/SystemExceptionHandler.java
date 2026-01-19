package com.dname074.loyalty_program_system.exception;

import com.dname074.loyalty_program_system.dto.LoyaltyProgramSystemExceptionDto;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SystemExceptionHandler {
    @ExceptionHandler(LoyaltyProgramSystemException.class)
    public ResponseEntity<LoyaltyProgramSystemExceptionDto> handleSystemException(LoyaltyProgramSystemException exception) {
        return ResponseEntity
                .status(exception.getStatus())
                .body(new LoyaltyProgramSystemExceptionDto(
                        exception.getMessage(),
                        exception.getStatus()
                ));
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<LoyaltyProgramSystemExceptionDto> handleDataIntegrityViolation(DataIntegrityViolationException exception) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(new LoyaltyProgramSystemExceptionDto(
                        exception.getMessage(),
                        HttpStatus.CONFLICT
                ));
    }
}
