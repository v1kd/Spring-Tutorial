package edu.asu.diging.tutorial.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vikranth on 1/22/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
