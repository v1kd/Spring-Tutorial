package edu.asu.diging.tutorial.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
