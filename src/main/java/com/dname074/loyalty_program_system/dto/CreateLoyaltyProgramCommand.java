package com.dname074.loyalty_program_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateLoyaltyProgramCommand {
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
}
