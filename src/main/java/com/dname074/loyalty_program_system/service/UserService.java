package com.dname074.loyalty_program_system.service;

import com.dname074.loyalty_program_system.model.User;
import com.dname074.loyalty_program_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public List<User> getAllUsers() {
        return repository.getAll();
    }
}
