package ca.ualberta.cs.lonelytwitter.lonelytweet;

import java.util.Date;

/**
 * Created by malik2 on 11/2/17.
 */

public class ImportantLonelyTweet extends LonelyTweet{

    // Issue fixed: unused declaration. Fixed because the date and text should be specified even if
    // this was used
    /*public ImportantLonelyTweet() {
    }*/

    public ImportantLonelyTweet(String text, Date date) {
        super(text, date);
    }

    @Override
    public String getTweetBody() {
        return tweetBody.toUpperCase();
    }


    public boolean isValid() {
        /*if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }

        return true;*/
        // Issue fixed: redundant if statement so that the method is much simpler to understand
        return (tweetBody.trim().length() > 0 && tweetBody.trim().length() <= 20);
    }


}
