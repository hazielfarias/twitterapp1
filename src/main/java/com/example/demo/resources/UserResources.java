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

import twitter4j.TwitterException;

@RestController
@RequestMapping("/tweets")
public class UserResources {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public  ResponseEntity<List<UsuarioTwitter>> findAll(@RequestParam("user") String user)throws TwitterException{   
		UsuarioTwitter usuario = new UsuarioTwitter(user);
		List<UsuarioTwitter> list = new ArrayList<>();
		list.addAll(Arrays.asList(usuario));
		userRepository.saveAll(Arrays.asList(usuario));
		return ResponseEntity.ok().body(list);
		
	} 
	/*
	@GetMapping
	public ResponseEntity<List<UsuarioTwitter>> findAll() throws TwitterException {
		UsuarioTwitter farias = new UsuarioTwitter("fariashaziel");
		UsuarioTwitter haziel = new UsuarioTwitter("hazielfarias");
		List<UsuarioTwitter> list = new ArrayList<>();
		list.addAll(Arrays.asList(farias,haziel));
		return ResponseEntity.ok().body(list);
	}
*/
	
}