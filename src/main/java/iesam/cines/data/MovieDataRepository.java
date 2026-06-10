package iesam.cines.data;

import iesam.cines.domain.Movie;
import iesam.cines.domain.MovieRepository;

public class MovieDataRepository implements MovieRepository {

    private MovieMemLocalDataSource dataSource = new MovieMemLocalDataSource().getInstance();

    @Override
    public void saveMovie(Movie movie) {
        dataSource.save(movie);
    }
}
