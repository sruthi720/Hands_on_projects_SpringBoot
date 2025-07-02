package com.chat.app.controller;

import com.chat.app.model.chatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class chatController {
    @MessageMapping("/sendMessage")//whatwer u want to send should be send over here
    @SendTo("/topic/messages")//whoever wann get message should be subscribed
    public chatMessage sendMessage(chatMessage message){
        return message;
    }

    @GetMapping("chat")
    public String chat(){ //whom ever is visiting this rootURL is we return the thymleaf template
        return "chat";
    }
}
