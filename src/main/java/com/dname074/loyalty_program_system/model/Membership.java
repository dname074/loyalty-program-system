package com.dname074.loyalty_program_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@EqualsAndHashCode(of = {"user", "program"})
@Entity
@Table(
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {
                        "user_id",
                        "program_id"
                })
        }
)

public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="program_id")
    private LoyaltyProgram program;
    private LocalDateTime joinDate;
    private Long pointsBalance;

    @PrePersist
    private void prePersistValues() {
        this.joinDate = LocalDateTime.now();
        this.pointsBalance = 0L;
    }
}
