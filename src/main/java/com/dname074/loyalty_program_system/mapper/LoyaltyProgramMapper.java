package com.dname074.loyalty_program_system.mapper;

import com.dname074.loyalty_program_system.dto.CreateLoyaltyProgramCommand;
import com.dname074.loyalty_program_system.dto.LoyaltyProgramDto;
import com.dname074.loyalty_program_system.model.LoyaltyProgram;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoyaltyProgramMapper {
    LoyaltyProgramDto toDto(LoyaltyProgram program);
    LoyaltyProgram toEntity(CreateLoyaltyProgramCommand program);
}
