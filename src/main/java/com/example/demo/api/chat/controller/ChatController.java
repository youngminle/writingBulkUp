package com.example.demo.api.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.demo.api.chat.dto.ChatMessage;

@Controller
public class ChatController {
    
    @MessageMapping("/chat.send")  // 클라이언트에서 /app/chat.send로 메시지를 보내면 처리
    @SendTo("/topic/public")       // 처리된 메시지를 /topic/public으로 발행
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        // 채팅 메시지 처리 및 브로드캐스트
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage) {
        // 새로운 사용자가 채팅방에 참여했을 때 처리
        chatMessage.setType("JOIN");
        return chatMessage;
    }
}

