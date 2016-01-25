package edu.asu.diging.tutorial.spring.domain;

/**
 * Created by Vikranth on 1/22/2016.
 */
public class Mood {

    private String feeling;

    private String reason;

    public Mood(String feeling, String reason) {
        this.feeling = feeling;
        this.reason = reason;
    }

    public Mood() {
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
