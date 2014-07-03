package no.nith.sivpal12.video.library.maintainer.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import no.nith.sivpal12.video.library.maintainer.domain.MediaItem;
import no.nith.sivpal12.video.library.maintainer.repositories.MovieRepository;
import no.nith.sivpal12.video.library.maintainer.services.MovieService;

import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Resource
    private MovieRepository movieRepository;

    @Override
    public List<MediaItem> getAllMovies() {
        List<MediaItem> movies = new ArrayList<>();

        MediaItem killBill = movieRepository.getMovie("kill bill");

        // MediaItem killBill = MediaItem.Builder
        // .init()
        // .description("Lorem ipsum dor sit amet")
        // .title("Kill Bill")
        // .image("http://static.rogerebert.com/uploads/movie/movie_poster/kill-bill-volume-1-2003/large_9O50TVszkz0dcP5g6Ej33UhR7vw.jpg")
        // .link("#")
        // .build();
        //
        for (int i = 0; i < 20; i++) {
            movies.add(killBill);
        }
        return movies;
    }

}
