package com.app.destiny.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.destiny.response.AbstractResponseDto;
import com.app.destiny.response.ResponseUtil;
import com.app.destiny.service.impl.UserAuthService;

@RestController
public class UserController {
	
	
	@Autowired
	UserAuthService userService;

	
	@RequestMapping(value = "/user/count", method = RequestMethod.GET)
    public HttpEntity<AbstractResponseDto> userCount() {
		
		userService.loadUserByUsername("user");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    	System.out.println("authentication=======================>"+authentication.getName());
        return ResponseUtil.success().body(userService.loadUserByUsername("user")).send(HttpStatus.OK);
    }
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public HttpEntity<AbstractResponseDto> login() {
		
		userService.loadUserByUsername("user");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    	System.out.println("authentication=======================>"+authentication.getName());
        return ResponseUtil.success().body(userService.loadUserByUsername("user")).send(HttpStatus.OK);
    }
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
    public HttpEntity<AbstractResponseDto> getDetails() {
		
		userService.loadUserByUsername("user");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    	System.out.println("authentication=======================>"+authentication.getName());
        return ResponseUtil.success().body(userService.loadUserByUsername("user")).send(HttpStatus.OK);
    }
	
	
}
