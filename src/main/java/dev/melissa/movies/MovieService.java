package dev.melissa.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//database access methods
@Service
public class MovieService {
    //auto-wire relationships, dependency injection
    @Autowired

    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
    return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
