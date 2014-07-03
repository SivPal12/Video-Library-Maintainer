package no.nith.sivpal12.video.library.maintainer.repositories;

import no.nith.sivpal12.video.library.maintainer.domain.MediaItem;

public interface MovieRepository {

    MediaItem getMovie(String movieTitle);

}
