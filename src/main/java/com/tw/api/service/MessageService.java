package com.tw.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tw.api.model.Message;
import com.tw.api.repository.MessageRepository;

import lombok.Data;

@Data
@Service
public class MessageService {
    @Autowired
    private MessageRepository msgRepo;

    public Iterable<Message> getMessages() {
        return msgRepo.findAll();
    }

    public Optional<Message> getMessageById(final Long id) {
        return msgRepo.findById(id);
    }

    public void deleteMessage(final Long id) {
        msgRepo.deleteById(id);
    }

    public Message createMessage(Message msg) {
        Message m = msgRepo.save(msg);
        return m;
    }
}
