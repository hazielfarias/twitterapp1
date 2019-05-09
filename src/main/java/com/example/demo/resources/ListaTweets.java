package com.example.demo.resources;



import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class ListaTweets {

	public String criaTweet(String usuario,int indice) throws TwitterException{
		String variavelDeAmbiente1 = System.getenv("CONSUMER_KEY");	
		String variavelDeAmbiente2 = System.getenv("CONSUMER_SECRET");
		String variavelDeAmbiente3 = System.getenv("TOKEN");
		String variavelDeAmbiente4 = System.getenv("TOKEN_SECRET");
		
		ConfigurationBuilder configBuilder = new ConfigurationBuilder();
		configBuilder.setDebugEnabled(true);
		configBuilder.setOAuthConsumerKey(variavelDeAmbiente1);
		configBuilder.setOAuthConsumerSecret(variavelDeAmbiente2);
		configBuilder.setOAuthAccessToken(variavelDeAmbiente3);
		configBuilder.setOAuthAccessTokenSecret(variavelDeAmbiente4);
			
		TwitterFactory twitterFactory = new TwitterFactory(configBuilder.build());
		Twitter twitter = twitterFactory.getInstance();
			
		ResponseList<Status> statuses = twitter.getUserTimeline(usuario);
			
		return statuses.get(indice).getText();
		}
}
