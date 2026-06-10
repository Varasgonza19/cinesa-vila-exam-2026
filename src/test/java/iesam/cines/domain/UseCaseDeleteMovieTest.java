package iesam.cines.domain;

import iesam.cines.mocks.MovieMocksDataRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UseCaseDeleteMovieTest {
    @Test
    public void deleteMovie(){
        MovieMocksDataRepository movieMocksDataRepository = new MovieMocksDataRepository();
        UseCaseDeleteMovie useCaseDeleteMovie = new UseCaseDeleteMovie(movieMocksDataRepository);

        useCaseDeleteMovie.execute("tt0133091");


    }
}
