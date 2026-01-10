package com.dname074.loyalty_program_system.controller;

import com.dname074.loyalty_program_system.dto.CreateLoyaltyProgramCommand;
import com.dname074.loyalty_program_system.dto.LoyaltyProgramDto;
import com.dname074.loyalty_program_system.service.LoyaltyProgramService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loyaltyProgram")
@RequiredArgsConstructor
public class LoyaltyProgramController {
    private final LoyaltyProgramService service;

    @PostMapping
    public LoyaltyProgramDto addLoyaltyProgram(@RequestBody CreateLoyaltyProgramCommand loyaltyProgram) {
        return service.addLoyaltyProgram(loyaltyProgram);
    }
}
