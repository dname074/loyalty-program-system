package com.dname074.loyalty_program_system.controller;

import com.dname074.loyalty_program_system.dto.CreateUserCommand;
import com.dname074.loyalty_program_system.dto.UserDto;
import com.dname074.loyalty_program_system.service.UserRegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/registration")
public class UserRegistrationController {
    private final UserRegistrationService service;

    @PostMapping
    public UserDto registerUser(@RequestBody CreateUserCommand user) {
        return service.registerUser(user);
    }
}
