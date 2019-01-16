package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Daniel Shim, Jan 15th 2019
 */

public class Tweet {

    private String message;
    private Date date;

    Tweet() {

    }

    Tweet(String message) {

        this.message = message;

    }

    public void setMessage(String message) {

        this.message = message;

    }

    public String getMessage() {

        return message;

    }

    @Override
    public String toString() {

        return message;

    }
}
