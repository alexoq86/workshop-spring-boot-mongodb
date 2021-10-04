package com.alexandreoqueiroz.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alexandreoqueiroz.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
