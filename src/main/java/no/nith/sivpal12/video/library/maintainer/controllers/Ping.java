package no.nith.sivpal12.video.library.maintainer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("system")
public class Ping {

    @RequestMapping("ping")
    public ModelAndView ping() {
        return new ModelAndView("ping");
    }

}
