package com.priya.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String message) {
        if (message == null) return "Say something!";

        switch (message.toLowerCase()) {
            case "hi":
                return "Hello 👋";
            case "bye":
                return "Goodbye 👋";
            default:
                return "I don't understand 🤔";
        }
    }
}
