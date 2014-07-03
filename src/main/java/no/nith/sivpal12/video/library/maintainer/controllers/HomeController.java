package no.nith.sivpal12.video.library.maintainer.controllers;

import no.nith.sivpal12.video.library.maintainer.constants.UriContext;
import no.nith.sivpal12.video.library.maintainer.domain.MediaItem;
import no.nith.sivpal12.video.library.maintainer.model.HomeModel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(UriContext.HOME)
    public ModelAndView home() {
        HomeModel homeModel = new HomeModel();
        MediaItem killBill = MediaItem.Builder
                .init()
                .description("Lorem ipsum dor sit amet")
                .title("Kill Bill")
                .image("http://static.rogerebert.com/uploads/movie/movie_poster/kill-bill-volume-1-2003/large_9O50TVszkz0dcP5g6Ej33UhR7vw.jpg")
                .link("#")
                .build();

        for (int i = 0; i < 20; i++) {
            homeModel.addMediaItem(killBill);
        }
        return new ModelAndView("home").addObject("model", homeModel);
    }

}
