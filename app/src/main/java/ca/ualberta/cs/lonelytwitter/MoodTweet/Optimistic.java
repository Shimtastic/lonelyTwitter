package ca.ualberta.cs.lonelytwitter.MoodTweet;
import java.util.*;

public class Optimistic extends MoodTweet{

    Optimistic() {
        Date date = new Date();
        super.setFeeling("Optimistic");
        super.setDate(date);
    }

    Optimistic(Date date) {
        super.setFeeling("Optimistic");
        super.setDate(date);
    }

    public String tweet() {
        return "The glass is half full.";
    }

}