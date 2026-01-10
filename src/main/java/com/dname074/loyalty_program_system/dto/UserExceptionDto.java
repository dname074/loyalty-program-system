package com.dname074.loyalty_program_system.dto;

import org.springframework.http.HttpStatus;

public record UserExceptionDto(String message, HttpStatus status) {
}
