package com.dname074.loyalty_program_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User user;
    private LoyaltyProgram program;
    private LocalDateTime joinDate;
    private Long pointsBalance;

    @PrePersist
    private void setNowDateTime() {
        this.joinDate = LocalDateTime.now();
    }
}
