package no.nith.sivpal12.video.library.maintainer.model;

import no.nith.sivpal12.video.library.maintainer.domain.Show;

import java.util.List;

public class ShowModel {

    private final List<Show> shows;

    public ShowModel(List<Show> shows) {
        this.shows = shows;
    }

    public List<Show> getShows() {
        return shows;
    }

}
