package com.example.demo.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import twitter4j.TwitterException;

@Document(collection="tweets")
public class UsuarioTwitter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String id;
	String user;
	List<String> tweets;
	
	
	public UsuarioTwitter(String user) throws TwitterException {
		
		this.user = user;
				
		ListaTweets h = new ListaTweets();
		List<String> nova1 = new ArrayList<>();
		
		int x = 0;
		while(x<11) {
			nova1.add(h.criaTweet(user,x));
			x++;
		}
		this.tweets = nova1;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public List<String> getTweets() {
		return tweets;
	}


	public void setTweets(List<String> tweets) {
		this.tweets = tweets;
	}
	
	
}
