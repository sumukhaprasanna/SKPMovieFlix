package com.skp.movieflix.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skp.movieflix.api.entity.User;
import com.skp.movieflix.api.repository.UserRespository;

@Service
public class UserService {
	
	@Autowired
	private UserRespository userRepo;
	
	public Object findAll(){
		return userRepo.findAll();
	}
	
	public User findById(Long userId){
		return userRepo.findOne(userId);
	}
	
	public User save(User user){
		return userRepo.save(user);
	}
	
	public void delete(User user){
		userRepo.delete(user);
	}
	
	public User findByEmail(String Email){
		return null;
	}

}
