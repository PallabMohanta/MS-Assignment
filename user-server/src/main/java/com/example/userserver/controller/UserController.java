package com.example.userserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.userserver.models.SignedupUser;
import com.example.userserver.models.User;

@Controller
public class UserController {
	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		System.out.println("\nHello From homepage!!");
		return "userlogin.jsp";
	}

	@RequestMapping(value="/userPage", method=RequestMethod.POST)
	public ModelAndView userPage(SignedupUser suser){
		System.out.println("From Login userPage suser- "+suser);
		ModelAndView mv;
			
		User user = restTemplate.getForObject("http://user-db-service/getUser/"+suser.getUid(), User.class);
		System.out.println("From UserDB to UserUI - "+user);
		if(user.getUid()== null || user.getUname() == null || user.getUpwd() == null) {
			mv = errorPage("U");
		}
		else if(!user.getUpwd().equals(suser.getUpwd())) {
			mv = errorPage("P");
		}
		else {
			mv = new ModelAndView();
			mv.setViewName("userpage.jsp");
			mv.addObject("userName", user.getUname());
		}
		return mv;
	}

	@RequestMapping(value="/userSignUp", method=RequestMethod.GET)
	public String signup(){
		System.out.println("\nHello From signuppage!!");
		return "usersignup.jsp";
	}
	
	@RequestMapping(value="/successSignUp", method=RequestMethod.POST)
	public ModelAndView successSignUp(User user){
		System.out.println("\nHello From successSignUpPage!!");
		System.out.println("From UserUI - "+user);

		User usr = restTemplate.postForObject("http://user-db-service/addUser", user, User.class);
		System.out.println("From UserDB - UserUI : "+usr);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName", usr.getUname());
		mv.addObject("userId", usr.getUid());
		mv.setViewName("successful.jsp");
		return mv;
	}
	
	@RequestMapping(value="/error", method=RequestMethod.GET)
	public ModelAndView errorPage(String flag) {
		ModelAndView mv = new ModelAndView();
		if(flag == "U") {
			mv.setViewName("usererrorpage.jsp");
		}
		else if(flag == "P"){
			mv.setViewName("pwderrorpage.jsp");
		}
		else {
			mv.setViewName("error.jsp");
		}
		return mv;
	}
}
