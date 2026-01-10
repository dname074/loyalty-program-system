package com.dname074.loyalty_program_system.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoyaltyProgramDto {
    private final Long id;
    private final String name;
    private final String description;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final Period validityPeriod;

    public LoyaltyProgramDto(Long id, String name, String description, LocalDate startDate, LocalDate endDate, Period validityPeriod) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.validityPeriod = validityPeriod;
    }
}
