package com.example.demo.api.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.api.login.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final UserService memberService;

    @GetMapping("/signup")
    public String signupForm() {
        return "web/login/signup";
    }

    @PostMapping("/signup")
    public String signup(@RequestParam String username, 
                        @RequestParam String password, 
                        RedirectAttributes redirectAttributes) {
        try {
            memberService.signup(username, password);
            return "redirect:/login?signup=success";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Signup failed. Please try again.");
            return "redirect:/signup";
        }
    }

    @GetMapping("/login")
    public String loginForm() {
        return "web/login/login";
    }
}