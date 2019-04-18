package com.duder.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.duder.app.models.EventUser;

@Repository
public interface UserRepository extends CrudRepository<EventUser, Long>{
	EventUser findByEmail(String email);
}
