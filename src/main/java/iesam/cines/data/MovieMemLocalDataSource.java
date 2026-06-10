package iesam.cines.data; //cambiar por la ruta correcta

import iesam.cines.domain.Movie;

import java.util.ArrayList;
import java.util.Objects;

public class MovieMemLocalDataSource {

    private MovieMemLocalDataSource instance = null;

    public MovieMemLocalDataSource getInstance() {
        if (instance == null){
            instance = new MovieMemLocalDataSource();
        }
        return instance;

    }

    private ArrayList<Movie> storage = new ArrayList<>();

    public ArrayList<Movie> findAll() {
        return storage;
    }

    public void save(Movie movie) {
        storage.add(movie);
    }

    public void delete(String movie) {
        storage.removeIf(movie1 ->
            Objects.equals(movie1.getId(), movie1)
        );
    }
}
