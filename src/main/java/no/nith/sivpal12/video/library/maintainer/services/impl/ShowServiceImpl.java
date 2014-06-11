package no.nith.sivpal12.video.library.maintainer.services.impl;

import no.nith.sivpal12.video.library.maintainer.domain.Show;
import no.nith.sivpal12.video.library.maintainer.services.ShowService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ShowServiceImpl implements ShowService {

    @Override
    public List<Show> getAllShows() {
        // TODO implement
        ArrayList<Show> shows = new ArrayList<>();
        shows.add(new Show("Dexter", 5));
        shows.add(new Show("Sherlock", 3));
        shows.add(new Show("Game Of Thrones", 45));
        shows.add(new Show("Hannibal", 90));
        shows.add(new Show("Suits", 2));
        // TODO implement end
        return shows;
    }

}
