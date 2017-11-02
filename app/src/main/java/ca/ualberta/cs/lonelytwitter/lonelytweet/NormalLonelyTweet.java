package ca.ualberta.cs.lonelytwitter.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	// Issue fixed: unused declaration. Fixed because the date and text should be specified even if
	// this was used
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