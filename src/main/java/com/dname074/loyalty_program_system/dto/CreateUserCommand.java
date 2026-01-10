package com.dname074.loyalty_program_system.dto;

public record CreateUserCommand(String firstName,
                                String lastName,
                                String email) {
}
