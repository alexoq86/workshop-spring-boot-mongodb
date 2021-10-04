package com.alexandreoqueiroz.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandreoqueiroz.workshopmongo.domain.User;
import com.alexandreoqueiroz.workshopmongo.repository.UserRepository;

@Service
public class UserService {
		
		@Autowired
		private UserRepository repo;
		
		public List<User> findAll(){
			return repo.findAll();
		}
}
