package com.chat.app.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
           registry.addEndpoint("/chat")
                   .setAllowedOrigins("http://localhost:8080")
                   .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //setting message broker
        registry.enableSimpleBroker("/topic"); // who ever subscribed chatroom1,ie. "/topic/chatroom1" -  will get the all messages
        //letting know the server when to process the message
        //expect message with /app/sendmessage ,if you get any message with this prefix ("/app") process it
        registry.setApplicationDestinationPrefixes("/app");

    }
}
