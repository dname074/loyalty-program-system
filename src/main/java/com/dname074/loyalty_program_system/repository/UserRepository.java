package com.dname074.loyalty_program_system.repository;

import com.dname074.loyalty_program_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
