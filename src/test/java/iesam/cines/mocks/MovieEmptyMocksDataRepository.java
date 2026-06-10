package iesam.cines.mocks;

import iesam.cines.domain.Movie;
import iesam.cines.domain.MovieRepository;

import java.util.ArrayList;

public class MovieEmptyMocksDataRepository implements MovieRepository {
    @Override
    public void saveMovie(Movie movie) {

    }

    @Override
    public ArrayList<Movie> getMovies() {
        return new ArrayList<>();
    }

    @Override
    public void deleteMovie(String id) {

    }
}
