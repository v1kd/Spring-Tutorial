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

    private String[] moods;

    private Map<String, String> moodMap;

    @PostConstruct
    public void initMood() {
        moods =  new String[] {
                "Happy", "Sad", "Excited"};
        moodMap = new HashMap<String, String>();

        moodMap.put(moods[0], "No reason :)");
        moodMap.put(moods[1], "I am just sad :(");
        moodMap.put(moods[2], "Because I have a Humanities class today :p");
    }

    public Mood getCurrentMood() {
        // Random value
        int numMoods = moods.length;
        int index = (int) Math.floor(Math.random() * numMoods);
        Mood mood = new Mood(moods[index], moodMap.get(moods[index]));
        return mood;
    }

    public String getReason(String feeling) {
        if (feeling == null)
            return null;

        return moodMap.get(feeling);
    }
}
