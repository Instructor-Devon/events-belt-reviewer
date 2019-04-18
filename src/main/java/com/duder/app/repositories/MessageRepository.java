package com.duder.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.Message;

public interface MessageRepository extends CrudRepository<Message, Long>{

}
