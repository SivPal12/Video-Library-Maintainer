package no.nith.sivpal12.video.library.maintainer.controllers;

import no.nith.sivpal12.video.library.maintainer.constants.UriContext;
import no.nith.sivpal12.video.library.maintainer.model.HomeModel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(UriContext.HOME)
    public ModelAndView home() {
        return new ModelAndView("home").addObject("model", new HomeModel());
    }

}
