package edu.asu.diging.tutorial.spring.service;

import edu.asu.diging.tutorial.spring.domain.Mood;

/**
 * Created by Vikranth on 1/22/2016.
 */
public interface MoodService {

    /**
     * Random mood
     * @return mood
     */
    public Mood getCurrentMood();

    /**
     * Reason for the mood
     * @return reason
     */
    public String getReason();

}
