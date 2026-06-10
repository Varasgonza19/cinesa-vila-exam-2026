package iesam.cines.mocks;

import iesam.cines.domain.Movie;
import iesam.cines.domain.MovieRepository;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieMocksDataRepository implements MovieRepository {

    static int countSaveMethod = 0;
    static int countDeleteMethod = 0;

    private ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(
       new Movie("tt0133095","2:20h","terror","2020"),
       new Movie("tt0133091","2:45h","action","2026")
    ));

    @Override
    public void saveMovie(Movie movie) {
        movies.add(movie);
        countSaveMethod ++;
    }

    @Override
    public ArrayList<Movie> getMovies() {
        return movies;
    }

    @Override
    public void deleteMovie(String id) {
        movies.removeIf(movie -> movie.getId().equals(id));
        countDeleteMethod ++;
    }
}
