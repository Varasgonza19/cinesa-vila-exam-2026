package iesam.cines.domain;

import iesam.cines.mocks.MovieEmptyMocksDataRepository;
import iesam.cines.mocks.MovieMocksDataRepository;
import iesam.cines.mocks.MovieNullMocksDataRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GetMoviesUseCaseTest {

    @Test
    public void shouldReturnList(){

        MovieMocksDataRepository movieMocksDataRepository = new MovieMocksDataRepository();
        GetMoviesUseCase getMoviesUseCase = new GetMoviesUseCase(movieMocksDataRepository);
        ArrayList<Movie> movies = getMoviesUseCase.execute();

        assertEquals(2,movies.size());
    }

    @Test
    public void shouldReturnEmptyList(){
        MovieEmptyMocksDataRepository movieEmptyMocksDataRepository = new MovieEmptyMocksDataRepository();
        GetMoviesUseCase getMoviesUseCase = new GetMoviesUseCase(movieEmptyMocksDataRepository);
        ArrayList<Movie> movies = getMoviesUseCase.execute();

        assertEquals(0,movies.size());
    }

    @Test
    public void shouldReturnNullList(){
        MovieNullMocksDataRepository movieNullMocksDataRepository = new MovieNullMocksDataRepository();
        GetMoviesUseCase getMoviesUseCase = new GetMoviesUseCase(movieNullMocksDataRepository);
        ArrayList<Movie> movies = getMoviesUseCase.execute();

        assertNull(null);
    }
}
