package no.nith.sivpal12.video.library.maintainer.controllers;

import javax.annotation.Resource;

import no.nith.sivpal12.video.library.maintainer.constants.ControllerModel;
import no.nith.sivpal12.video.library.maintainer.constants.UriContext;
import no.nith.sivpal12.video.library.maintainer.constants.ViewName;
import no.nith.sivpal12.video.library.maintainer.model.HomeModel;
import no.nith.sivpal12.video.library.maintainer.services.MovieService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Resource
    private MovieService movieService;

    @RequestMapping(UriContext.HOME)
    public ModelAndView home() {
        HomeModel homeModel = new HomeModel();

        homeModel.addMediaItems(movieService.getAllMovies());

        return new ModelAndView(ViewName.HOME)
                .addObject(ControllerModel.HOME, homeModel);
    }

}
