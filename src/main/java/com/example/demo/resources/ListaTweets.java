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
		cb.setOAuthConsumerKey("G8fmFzwah9N0bmc3rihi9r6ko");
		cb.setOAuthConsumerSecret("36jYOaqMPDpoZVtOAFtk1cagf5KxG9TAkzDOLmOJgMVWdO1ACb");
		cb.setOAuthAccessToken("1122961205684051968-HLqWT9oEosBfU7zktpI1LzGcIQuFz4");
		cb.setOAuthAccessTokenSecret("07XJ7AHftI0jgpHTPOrrbedjYUac7XnK6giSSIrtqKtbY");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter tt = tf.getInstance();
		//tt.updateStatus("Ai mais uma coisa");
		//Paging h = new Paging(1,1);
		ResponseList<Status> statuses = tt.getUserTimeline(x);
		
		
		
		
		return statuses.get(y).getText();
		}
}
