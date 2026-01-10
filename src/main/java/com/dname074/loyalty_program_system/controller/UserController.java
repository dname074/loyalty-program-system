package com.dname074.loyalty_program_system.controller;

import com.dname074.loyalty_program_system.dto.UserDto;
import com.dname074.loyalty_program_system.mapper.UserMapper;
import com.dname074.loyalty_program_system.model.User;
import com.dname074.loyalty_program_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;
    private final UserMapper mapper;

    @GetMapping
    public List<UserDto> getAllUsers() {
        return service.getAllUsers().stream()
                .map(mapper::toDto)
                .toList();
    }
}
