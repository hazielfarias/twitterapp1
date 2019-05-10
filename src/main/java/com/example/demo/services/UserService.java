package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.reposiroty.UserRepository;
import com.example.demo.resources.UsuarioTwitter;

import twitter4j.TwitterException;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	public List<UsuarioTwitter> findAll(){
		  return userRepository.findAll();
	}
	
	
	
	
	
	public List<UsuarioTwitter> ServiceTwitter (String user) throws TwitterException {
		
		UsuarioTwitter usuario = new UsuarioTwitter(user);
		List<UsuarioTwitter> list = new ArrayList<>();
		list.addAll(Arrays.asList(usuario));
		userRepository.saveAll(Arrays.asList(usuario));
		return list;
	}
	
	
	
	
	
	
	

}
