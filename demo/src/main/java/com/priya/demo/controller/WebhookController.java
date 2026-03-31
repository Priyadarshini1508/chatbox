package com.priya.demo.controller;

import com.priya.demo.dto.MessageRequest;
import com.priya.demo.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.priya.demo.service.ChatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/webhook")
    public MessageResponse handleMessage(@RequestBody MessageRequest request) {

        final Logger logger = LoggerFactory.getLogger(WebhookController.class);

        logger.info("Incoming message: {}", request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }
}
