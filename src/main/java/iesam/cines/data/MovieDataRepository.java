package iesam.cines.data;

import iesam.cines.domain.Movie;
import iesam.cines.domain.MovieRepository;

import java.util.ArrayList;

public class MovieDataRepository implements MovieRepository {

    private MovieMemLocalDataSource dataSource = new MovieMemLocalDataSource().getInstance();

    @Override
    public void saveMovie(Movie movie) {
        dataSource.save(movie);
    }

    @Override
    public ArrayList<Movie> getMovies() {
        return dataSource.findAll();
    }
}
