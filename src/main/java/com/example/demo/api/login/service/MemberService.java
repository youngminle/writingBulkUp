package com.example.demo.api.login.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.api.login.entity.Member;
import com.example.demo.api.login.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void signup(String username, String password) {
        String encodedPassword = passwordEncoder.encode(password);
        Member member = new Member(username, encodedPassword, "USER");
        memberRepository.save(member);
    }
}

