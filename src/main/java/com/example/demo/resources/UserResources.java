package com.example.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.reposiroty.UserRepository;
import com.example.demo.services.UserService;

import twitter4j.TwitterException;

@RestController
@RequestMapping("/tweets")
public class UserResources {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public  ResponseEntity<List<UsuarioTwitter>> findAll(@RequestParam("user") String user)throws TwitterException{   
		
		UserService listaTweets = new UserService(user);
		
		return ResponseEntity.ok().body(listaTweets.ServiceTwitter());
		
	}

	

	
}