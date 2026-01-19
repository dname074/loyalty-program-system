package com.dname074.loyalty_program_system.service;

import com.dname074.loyalty_program_system.dto.CreateUserCommand;
import com.dname074.loyalty_program_system.dto.UserDto;
import com.dname074.loyalty_program_system.exception.ResourceNotFoundException;
import com.dname074.loyalty_program_system.mapper.UserMapper;
import com.dname074.loyalty_program_system.model.LoyaltyProgram;
import com.dname074.loyalty_program_system.model.User;
import com.dname074.loyalty_program_system.repository.LoyaltyProgramRepository;
import com.dname074.loyalty_program_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRegistrationService {
    private final UserRepository userRepository;
    private final LoyaltyProgramRepository loyaltyProgramRepository;
    private final UserMapper mapper;

    public UserDto registerUser(CreateUserCommand createUserCommand) {
        LoyaltyProgram loyaltyProgram = loyaltyProgramRepository.findByName(createUserCommand.loyaltyProgramName())
                .orElseThrow(() -> new ResourceNotFoundException("Nie znaleziono podanego programu lojalnościowego"));
        User user = mapper.toEntity(createUserCommand);
        user.addMembership(loyaltyProgram);
        return mapper.toDto(userRepository.save(user));

    }
}
