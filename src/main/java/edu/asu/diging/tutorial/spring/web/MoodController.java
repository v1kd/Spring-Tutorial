package edu.asu.diging.tutorial.spring.web;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.service.MoodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Vikranth on 1/25/2016.
 */
@Controller
public class MoodController {

    @Resource(name = "moodServiceImpl")
    private MoodService moodService;

    /**
     * Random mood
     * @param model
     * @return view
     */
    @RequestMapping(value = "/mood", method = RequestMethod.GET)
    public String getMood(Model model) {
        Mood mood = moodService.getCurrentMood();
        model.addAttribute("mood", mood);
        return "mood";
    }

    /**
     * Reason for the mood
     * @param model
     * @return view
     */
    @RequestMapping(value = "/reason/{feeling}", method = RequestMethod.GET)
    public String getReason(Model model, @PathVariable("feeling") String feeling) {
        String reason = moodService.getReason(feeling);
        model.addAttribute("reason", reason);

        return "reason";
    }
}
