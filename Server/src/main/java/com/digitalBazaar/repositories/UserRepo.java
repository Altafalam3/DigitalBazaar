package com.digitalBazaar.repositories;

import com.digitalBazaar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    public User findByEmail(String e);
}
