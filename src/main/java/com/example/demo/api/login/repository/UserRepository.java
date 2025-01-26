package com.example.demo.api.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.api.login.entity.TbUser;

public interface UserRepository extends JpaRepository<TbUser, Long> {
    Optional<TbUser> findByUsername(String username);
}


