package edu.asu.diging.tutorial.spring.web;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.service.MoodService;
import edu.asu.diging.tutorial.spring.service.impl.MoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Vikranth on 1/22/2016.
 */
@Controller
public class HomeController {

    /**
     * Home
     * @return view
     */
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("head", "Spring tutorial");
        return "index";
    }
}
