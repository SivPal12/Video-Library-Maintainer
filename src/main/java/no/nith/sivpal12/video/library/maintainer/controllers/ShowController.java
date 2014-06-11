package no.nith.sivpal12.video.library.maintainer.controllers;

import no.nith.sivpal12.video.library.maintainer.constants.ControllerModel;
import no.nith.sivpal12.video.library.maintainer.constants.UriContext;
import no.nith.sivpal12.video.library.maintainer.constants.ViewName;
import no.nith.sivpal12.video.library.maintainer.model.ShowModel;
import no.nith.sivpal12.video.library.maintainer.services.ShowService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(UriContext.SHOWS_ROOT)
public class ShowController {

    @Resource
    private ShowService showService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView viewAllTvShows() {
        return new ModelAndView(ViewName.SHOWS)
                .addObject(ControllerModel.SHOWS, new ShowModel(showService.getAllShows()));
    }

}
