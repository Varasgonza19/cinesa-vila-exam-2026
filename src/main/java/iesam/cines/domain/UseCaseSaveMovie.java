package iesam.cines.domain;

public class UseCaseSaveMovie {
    private MovieRepository movieRepository;

    public UseCaseSaveMovie(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void execute(Movie movie){
        movieRepository.saveMovie(movie);
    }
}
