package com.dname074.loyalty_program_system.repository;

import com.dname074.loyalty_program_system.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final List<User> users;

    public List<User> getAll() {
        return new ArrayList<>(users);
    }
}
