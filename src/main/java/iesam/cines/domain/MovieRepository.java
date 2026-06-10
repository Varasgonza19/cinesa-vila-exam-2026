package iesam.cines.domain;

import java.util.ArrayList;

public interface MovieRepository {
    void saveMovie(Movie movie);
    ArrayList<Movie> getMovies();
    void deleteMovie(String id);
}
