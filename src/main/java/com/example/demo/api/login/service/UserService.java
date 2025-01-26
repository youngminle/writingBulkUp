package com.example.demo.api.login.service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.api.login.entity.TbUser;
import com.example.demo.api.login.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void signup(String username, String password) {
        Optional<TbUser> userOp = userRepository.findByUsername(username);
        if (userOp.isPresent()) {
            throw new IllegalStateException("Username already exists");
        }
        String encodedPassword = passwordEncoder.encode(password);
        TbUser user = new TbUser(username, encodedPassword, "1");
        userRepository.save(user);
    }
}

