package com.example.demo.api.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class TbUser {

    public TbUser(String username, String encodedPassword, String role) {
        this.username = username;
        this.user_pw = encodedPassword;
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    
    @Column(name="userId", unique = true)
    private String username;

    @Column(name="user_pw")
    private String user_pw;


    private String role;

}
