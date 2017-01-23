package com.skp.movieflix.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skp.movieflix.api.entity.User;
import com.skp.movieflix.api.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public Object index(){
		return userService.findAll();
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String create(@RequestBody User user){
		String userId="";
		try{
			userService.save(user);
			userId=String.valueOf(user.getUserId());
		}catch(Exception e){
			return "Error creating user: "+e.toString();
		}
		return "User successfully created, userId = "+userId;
	}
	
	@RequestMapping("/delete/{userId}")
	@ResponseBody
	public String delete(@PathVariable long userId){
		try{
			User user = userService.findById(userId);
			userService.delete(user);
		}catch(Exception e){
			return "Error deleting user: "+e.toString();
		}
		return "User Successfully deleted";
	}
	
	@RequestMapping("/get-by-email")
	@ResponseBody
	public String getByEmail(String email){
		String userId="";
		try{
			User user = userService.findByEmail(email);
			userId = String.valueOf(user.getUserId());
		}catch(Exception e){
			return "User not found";
		}
		return "The user id is: "+userId;
	}
	
	@RequestMapping("/update/{userId}")
	@ResponseBody
	public String updateUser(@RequestBody User user,@PathVariable long userId){
		try{
			user.setUserId(userId);
			userService.save(user);
		}catch(Exception e){
			return "Error updating the user: "+e.toString();
		}
		return "User Successfully updated.";
	}

}
