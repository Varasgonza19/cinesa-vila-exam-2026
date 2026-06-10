package iesam.cines.presentation;

import iesam.cines.data.MovieDataRepository;
import iesam.cines.domain.GetMoviesUseCase;
import iesam.cines.domain.Movie;
import iesam.cines.domain.UseCaseSaveMovie;

import java.util.ArrayList;

public class MovieView {

    public static void saveMovie(){
        Movie movie = new Movie("tt0133093","2:20h","terror","2017");
        UseCaseSaveMovie useCaseSaveMovie = new UseCaseSaveMovie(new MovieDataRepository());
        useCaseSaveMovie.execute(movie);
        System.out.println("Movie save :: " + movie);
    }

    public static void prints(){
        GetMoviesUseCase getMoviesUseCase = new GetMoviesUseCase(new MovieDataRepository());
        ArrayList<Movie> movies = getMoviesUseCase.execute();
        System.out.println(movies);
    }

}
