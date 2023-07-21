package com.tw.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.tw.api.model.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
    
}
