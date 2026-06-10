package iesam.cines.domain;

import java.util.ArrayList;

public class GetMoviesUseCase {
    private MovieRepository movieRepository;


    public GetMoviesUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public ArrayList<Movie> execute(){
        return movieRepository.getMovies();
    }
}
