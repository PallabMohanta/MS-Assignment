package com.example.userdbserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.userdbserver.models.User;
import com.example.userdbserver.repo.UserRepo;

@Controller
public class UserDBController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public @ResponseBody User addUser(@RequestBody User user) {
		System.out.println("From UserDB UserOBJ- "+user);
		repo.save(user);
		return user;
	}
	
	@RequestMapping(value="/getUser/{uid}", method=RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable("uid") Long uid) {
		System.out.println("From UserDB id- "+uid);
		User usr = repo.findById(uid).orElse(new User());
		System.out.println(usr);
		return usr;
	}

}
