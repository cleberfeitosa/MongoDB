package com.cleberfeitosa.MongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cleberfeitosa.MongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
