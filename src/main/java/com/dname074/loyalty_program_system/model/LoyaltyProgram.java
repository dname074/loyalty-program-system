package com.dname074.loyalty_program_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@Entity
@Table(
        name="LoyaltyProgram",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "name")
        }
)
public class LoyaltyProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Period validityPeriod;

    @PrePersist
    @PreUpdate
    private void calculateValidityPeriod() {
        if (endDate == null) {
            validityPeriod = null;
        } else {
            validityPeriod = Period.between(startDate, endDate);
        }
    }
}
