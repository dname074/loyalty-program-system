package com.dname074.loyalty_program_system.repository;

import com.dname074.loyalty_program_system.model.LoyaltyProgram;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class LoyaltyProgramRepository {
    private final List<LoyaltyProgram> programs;

    public Optional<LoyaltyProgram> addLoyaltyProgram(LoyaltyProgram program) {
        if (programs.contains(program)) {
            return Optional.empty();
        }
        programs.add(program);
        return Optional.of(program);
    }
}
