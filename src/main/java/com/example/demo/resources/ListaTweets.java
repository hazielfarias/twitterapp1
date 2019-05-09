package com.example.demo.resources;



import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class ListaTweets {
	
	


public String criaTweet(String x,int y) throws TwitterException{
		String variavelDeAmbiente1 = System.getenv("CONSUMER_KEY");	
		String variavelDeAmbiente2 = System.getenv("CONSUMER_SECRET");
		String variavelDeAmbiente3 = System.getenv("TOKEN");
		String variavelDeAmbiente4 = System.getenv("TOKEN_SECRET");
	
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey(variavelDeAmbiente1);
		cb.setOAuthConsumerSecret(variavelDeAmbiente2);
		cb.setOAuthAccessToken(variavelDeAmbiente3);
		cb.setOAuthAccessTokenSecret(variavelDeAmbiente4);
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter tt = tf.getInstance();
		//tt.updateStatus("Ai mais uma coisa");
		//Paging h = new Paging(1,1);
		ResponseList<Status> statuses = tt.getUserTimeline(x);
		
		
		
		
		return statuses.get(y).getText();
		}
}
