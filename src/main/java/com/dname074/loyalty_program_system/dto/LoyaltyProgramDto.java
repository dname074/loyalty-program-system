package com.dname074.loyalty_program_system.dto;

import java.time.LocalDate;
import java.time.Period;

public record LoyaltyProgramDto(Long id, String name, String description, LocalDate startDate, LocalDate endDate, Period validityPeriod) {
}
