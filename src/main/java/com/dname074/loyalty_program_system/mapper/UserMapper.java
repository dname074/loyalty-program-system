package com.dname074.loyalty_program_system.mapper;

import com.dname074.loyalty_program_system.dto.CreateUserCommand;
import com.dname074.loyalty_program_system.dto.UserDto;
import com.dname074.loyalty_program_system.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(CreateUserCommand createUserCommand);
}
