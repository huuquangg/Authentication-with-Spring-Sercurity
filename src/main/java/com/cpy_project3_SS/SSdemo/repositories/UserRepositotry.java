package com.cpy_project3_SS.SSdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpy_project3_SS.SSdemo.entities.User;

@Repository
public interface UserRepositotry extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
