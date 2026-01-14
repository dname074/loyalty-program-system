package com.dname074.loyalty_program_system.repository;

import com.dname074.loyalty_program_system.model.LoyaltyProgram;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoyaltyProgramRepository extends JpaRepository<LoyaltyProgram, Long> {
    Optional<LoyaltyProgram> findByName(String name);
}
