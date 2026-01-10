package com.dname074.loyalty_program_system.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import java.time.Period;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record LoyaltyProgramDto(Long id, String name, String description, LocalDate startDate, LocalDate endDate, Period validityPeriod) {
}
