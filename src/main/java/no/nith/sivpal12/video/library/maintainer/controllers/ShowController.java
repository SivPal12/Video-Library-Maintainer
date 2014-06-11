package no.nith.sivpal12.video.library.maintainer.controllers;

import no.nith.sivpal12.video.library.maintainer.constants.ControllerModel;
import no.nith.sivpal12.video.library.maintainer.constants.UriContext;
import no.nith.sivpal12.video.library.maintainer.constants.ViewName;
import no.nith.sivpal12.video.library.maintainer.domain.Show;
import no.nith.sivpal12.video.library.maintainer.model.ShowModel;
import no.nith.sivpal12.video.library.maintainer.service.ShowService;

import java.util.ArrayList;

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
        ArrayList<Show> shows = new ArrayList<Show>();
        shows.add(new Show("Dexter", 5));
        shows.add(new Show("Sherlock", 3));
        shows.add(new Show("Game Of Thrones", 45));
        shows.add(new Show("Hannibal", 90));
        shows.add(new Show("Suits", 2));
        ShowModel showModel = new ShowModel(shows);

        return new ModelAndView(ViewName.SHOWS)
                .addObject(ControllerModel.SHOWS, showModel);
    }

}
