package com.dname074.loyalty_program_system.service;

import com.dname074.loyalty_program_system.dto.CreateLoyaltyProgramCommand;
import com.dname074.loyalty_program_system.dto.LoyaltyProgramDto;
import com.dname074.loyalty_program_system.mapper.LoyaltyProgramMapper;
import com.dname074.loyalty_program_system.model.LoyaltyProgram;
import com.dname074.loyalty_program_system.repository.LoyaltyProgramRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoyaltyProgramService {
    private final LoyaltyProgramRepository repository;
    private final LoyaltyProgramMapper mapper;

    public LoyaltyProgramDto addLoyaltyProgram(CreateLoyaltyProgramCommand loyaltyProgram) {
        LoyaltyProgram program = repository.save(mapper.toEntity(loyaltyProgram));
        return mapper.toDto(program);
    }
}
