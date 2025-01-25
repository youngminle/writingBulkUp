package com.example.demo.web.login.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login2")
public class loginController {

    @GetMapping("/")
    public String login(){
        return "web/login/login";
    }

    @GetMapping("/sing_in")
    public String siginin(){
        return "";
    }

    @GetMapping("/sing_up")
    public String siginip(){
        return "";
    }

}
