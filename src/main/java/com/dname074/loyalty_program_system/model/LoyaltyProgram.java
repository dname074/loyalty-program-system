package com.dname074.loyalty_program_system.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
public class LoyaltyProgram {
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Period validityPeriod;
    private static Long programsAmount = 0L;

    @Autowired
    public LoyaltyProgram(String name, String description, LocalDate startDate, LocalDate endDate) {
        programsAmount++;
        this.id = programsAmount;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        if (endDate != null) {
            this.validityPeriod = Period.between(startDate, endDate);
            this.endDate = endDate;
        }
    }
}
