package ca.ualberta.cs.lonelytwitter.MoodTweet;
import java.util.*;

public class Pessimistic extends MoodTweet{

    Pessimistic() {
        Date date = new Date();
        super.setFeeling("Pessimistic");
        super.setDate(date);
    }

    Pessimistic(Date date) {
        super.setFeeling("Pessimistic");
        super.setDate(date);
    }

    public String tweet() {
        return "The glass is half empty.";
    }

}