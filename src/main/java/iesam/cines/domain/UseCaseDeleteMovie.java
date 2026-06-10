package iesam.cines.domain;

public class UseCaseDeleteMovie {

    private MovieRepository movieRepository;

    public UseCaseDeleteMovie(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public void execute(String id){
        movieRepository.deleteMovie(id);
    }
}
