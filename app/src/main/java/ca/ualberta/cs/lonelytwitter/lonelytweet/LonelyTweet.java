package ca.ualberta.cs.lonelytwitter.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by malik2 on 11/2/17.
 */

public abstract class LonelyTweet implements Serializable {

    private static final long serialVersionUID = 1L;
    // Issue Fixed: changed from protected to private. Prevents the subclasses from modifying it accidentally
    private Date tweetDate;
    protected String tweetBody;

    // removed because the date and text should be specified
    /*public LonelyTweet() {
    }*/

    public LonelyTweet(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    public abstract String getTweetBody();

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public boolean isValid() {
        /*if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10) {
            return false;
        }

        return true;*/
        // Issue fixed: redundant if statement so that the method is much simpler to understand
        return (tweetBody.trim().length() > 0 && tweetBody.trim().length() <= 10);
    }

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }

}
