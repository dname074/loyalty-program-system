package com.dname074.loyalty_program_system.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Membership {
    private Long id;
    private User user;
    private LoyaltyProgram program;
    private LocalDateTime joinDate;
    private Long pointsBalance;
    private static Long membershipsAmount = 0L;

    @Autowired
    public Membership(Long pointsBalance, User user, LoyaltyProgram program) {
        membershipsAmount++;
        this.id = membershipsAmount;
        this.user = user;
        this.program = program;
        this.joinDate = LocalDateTime.now();
        this.pointsBalance = pointsBalance;
    }
}
