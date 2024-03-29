package com.task.controller;

import com.task.model.Message;
import com.task.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }

    @GetMapping("/list")
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
