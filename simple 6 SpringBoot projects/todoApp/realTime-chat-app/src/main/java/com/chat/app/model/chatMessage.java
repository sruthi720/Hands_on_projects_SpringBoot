package com.chat.app.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class chatMessage {
    private Long id;
    private String sender;
    private String content;
}
