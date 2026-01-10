package com.dname074.loyalty_program_system.dto;

import java.time.LocalDate;

public record CreateLoyaltyProgramCommand(String name, String description,
        LocalDate startDate, LocalDate endDate) {
}
