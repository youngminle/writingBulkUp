package com.example.demo.api.chat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private String type;     // 메시지 타입 (JOIN, CHAT 등)
    private String content;  // 메시지 내용
    private String sender;   // 발신자
    private String roomId;   // 채팅방 ID (다중 채팅방 구현 시 사용)
}
