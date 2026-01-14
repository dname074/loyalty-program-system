package com.dname074.loyalty_program_system.repository;

import com.dname074.loyalty_program_system.model.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
