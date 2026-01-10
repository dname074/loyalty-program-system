package com.dname074.loyalty_program_system.dto;

import java.time.LocalDateTime;

public record UserDto(Long id,
        String firstName,
        String lastName,
        String email,
        LocalDateTime registrationDate) {
}
