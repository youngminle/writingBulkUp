package com.example.demo.web.chattest.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class chat_test {
    @GetMapping("/chat_test")
    public String main() {
        return "web/chat_test/chat_test";
    }
}
