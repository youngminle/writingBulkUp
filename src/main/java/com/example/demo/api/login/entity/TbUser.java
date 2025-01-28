package com.example.demo.api.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class TbUser {

    public TbUser(String username, String encodedPassword, String role, String name, LocalDate birthday, String phoneNumber, String email) {
        this.username = username;
        this.user_pw = encodedPassword;
        this.role = role;
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createDate = LocalDateTime.now();
        this.personalInformationExpirationDate = LocalDate.now().plusYears(1);
        this.userExpirationDate = LocalDate.now().plusYears(1);
        this.lastLogin = LocalDateTime.now();
        this.deleteYn = false;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    private Long idx;
    
    @Column(name="userId", unique = true)
    private String username;

    @Column(name="user_pw")
    private String user_pw;

    @Column(name = "role")
    private String role;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "create_datetime")
    private LocalDateTime createDate;

    @Column(name = "personal_information_expiration_date")
    private LocalDate personalInformationExpirationDate;

    @Column(name = "user_expiration_date")
    private LocalDate userExpirationDate;

    @Column(name = "last_login_datetime")
    private LocalDateTime lastLogin;

    @Column(name = "deleteYN")
    private boolean deleteYn;
}
