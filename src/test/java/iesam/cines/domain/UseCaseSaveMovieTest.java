package iesam.cines.domain;

import iesam.cines.mocks.MovieMocksDataRepository;
import org.junit.jupiter.api.Test;

public class UseCaseSaveMovieTest {

    @Test
    public void saveMovie(){
        MovieMocksDataRepository movieMocksDataRepository = new MovieMocksDataRepository();
        UseCaseSaveMovie useCaseSaveMovie = new UseCaseSaveMovie(movieMocksDataRepository);

        Movie movie = new Movie("tt0133088","1:45","fantasy","2021");
        useCaseSaveMovie.execute(movie);


    }
}
