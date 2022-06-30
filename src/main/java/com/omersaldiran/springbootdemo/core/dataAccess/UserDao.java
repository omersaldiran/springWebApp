package com.omersaldiran.springbootdemo.core.dataAccess;

import com.omersaldiran.springbootdemo.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
