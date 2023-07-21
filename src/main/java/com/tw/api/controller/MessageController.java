package com.tw.api.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tw.api.model.Message;
import com.tw.api.service.MessageService;

@RestController
public class MessageController {
    @Autowired
    private MessageService msgService;

    @GetMapping("/messages")
    public Iterable<Message> getMessages() {
        return msgService.getMessages();
    }

    @GetMapping("/messages/{id}")
    public Optional<Message> getMessageById(@PathVariable Long id) {
        return msgService.getMessageById(id);
    }

    @PostMapping("/messages/create")
    public Message creatMessage(@RequestBody Message msg) {
        return msgService.createMessage(msg);
    }

    @PutMapping("/messages/update/{id}")
    public Message updateMessage(@PathVariable Long id, @RequestBody Message msg) {
        Optional<Message> m = msgService.getMessageById(id);

        if (m.isPresent()) {
            Message currentMessage = m.get();

            String text = msg.getText();
            LocalDateTime dateTime = msg.getDateTime();
            String user = msg.getUser();

            if (text != null)
                currentMessage.setText(text);
            if (dateTime != null)
                currentMessage.setDateTime(dateTime);
            if (user != null)
                currentMessage.setUser(user);
            
            msgService.createMessage(currentMessage);
            return currentMessage;
        }
        return null;
    }

    @DeleteMapping("/messages/remove/{id}")
    public void deleteMessage(@PathVariable Long id) {
        msgService.deleteMessage(id);
    }
}
