package ca.ualberta.cs.lonelytwitter.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	// Issue fixed: unused declaration
	/*public NormalLonelyTweet() {
	}*/

	public NormalLonelyTweet(String text, Date date) {
		super(text, date);
	}

	@Override
	public String getTweetBody() {
		return tweetBody;
	}

}