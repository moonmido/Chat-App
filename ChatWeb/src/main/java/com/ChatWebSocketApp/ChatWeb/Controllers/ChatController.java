package com.ChatWebSocketApp.ChatWeb.Controllers;

import com.ChatWebSocketApp.ChatWeb.Models.ChatModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {


    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatModel SendMessage(ChatModel chatModel){
return chatModel;
    }


}
