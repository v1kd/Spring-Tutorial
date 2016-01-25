package edu.asu.diging.tutorial.spring.service.impl;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.service.MoodService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vikranth on 1/22/2016.
 */
@Service
public class MoodServiceImpl implements MoodService {

    private static final String[] MOODS = new String[] {
            "Happy", "Sad", "Excited"};

    private static final Map<String, String> MOOD_MAP = new HashMap<String, String>();

    static {
        MOOD_MAP.put(MOODS[0], "No reason :)");
        MOOD_MAP.put(MOODS[1], "I am just sad :(");
        MOOD_MAP.put(MOODS[2], "Because I have a Humanities class today :p");
    }

    private Mood mood;

    @PostConstruct
    public void initMood() {
        // Random value
        int numMoods = MOODS.length;
        int index = (int) Math.floor(Math.random() * numMoods);
        this.mood = new Mood(MOODS[index], MOOD_MAP.get(MOODS[index]));
    }

    public Mood getCurrentMood() {
        return mood;
    }

    public String getReason() {
        return mood.getReason();
    }
}
