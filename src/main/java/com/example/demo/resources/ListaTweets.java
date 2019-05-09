package com.example.demo.resources;



import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class ListaTweets {
	
	


public String criaTweet(String x,int y) throws TwitterException{
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true);
		cb.setOAuthConsumerKey(${CONSUMER_KEY});
		cb.setOAuthConsumerSecret(${CONSUMER_SECRET});
		cb.setOAuthAccessToken(${TOKEN});
		cb.setOAuthAccessTokenSecret(${TOKEN_SECRET});
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter tt = tf.getInstance();
		//tt.updateStatus("Ai mais uma coisa");
		//Paging h = new Paging(1,1);
		ResponseList<Status> statuses = tt.getUserTimeline(x);
		
		
		
		
		return statuses.get(y).getText();
		}
}
