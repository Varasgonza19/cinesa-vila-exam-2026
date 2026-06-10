package iesam.cines.presentation;

import iesam.cines.data.MovieDataRepository;
import iesam.cines.domain.Movie;
import iesam.cines.domain.UseCaseSaveMovie;

public class MovieView {

    public static void saveMovie(){
        Movie movie = new Movie("tt0133093","2:20h","terror","2017");
        UseCaseSaveMovie useCaseSaveMovie = new UseCaseSaveMovie(new MovieDataRepository());
        useCaseSaveMovie.execute(movie);
        System.out.println("Movie save :: " + movie);
    }
}
