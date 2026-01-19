package com.dname074.loyalty_program_system.service;

import com.dname074.loyalty_program_system.dto.UserDto;
import com.dname074.loyalty_program_system.mapper.UserMapper;
import com.dname074.loyalty_program_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    public List<UserDto> getAllUsers() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }
}
