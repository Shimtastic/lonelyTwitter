package ca.ualberta.cs.lonelytwitter.MoodTweet;
import java.util.*;

public abstract class MoodTweet {

    private String feeling;
    private Date date = new Date();

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String tweet();

}
