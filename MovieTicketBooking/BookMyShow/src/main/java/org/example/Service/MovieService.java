package org.example.Service;

import org.example.Model.Movie;

import javax.net.ssl.SSLSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MovieService {

    private final Map<String,Movie> movies;

    public MovieService(){
        this.movies = new HashMap<>();
    }

    public Movie getMovie(String movieId) {
        return movies.get(movieId);
    }

    public Movie createMovie(String movieName) {
        String movieId = UUID.randomUUID().toString();
        Movie newMovie = new Movie(movieId,movieName);
        movies.put(movieId,newMovie)
        return newMovie;
    }
}
