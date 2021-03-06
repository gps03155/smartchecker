package com.douzone.smartchecker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.smartchecker.service.UserService;
import com.douzone.smartchecker.vo.UserDetailVo;

@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginForm() {
		
		return "user/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login() {
		
		return "user/login";
	}
	
	@RequestMapping(value="/")
	public String main(@AuthenticationPrincipal UserDetailVo user) {
		
		System.out.println(user.getName());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
//		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
//		System.out.println(userDetails.getUsername());
//		System.out.println(userDetails.getPassword());

//		UserVo userVo = (UserVo) authentication.getPrincipal();
//		System.out.println(userVo.toString());
		return "user/login";
	}
	

	
	
}
