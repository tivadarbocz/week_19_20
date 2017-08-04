package hu.helixlab.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Admin on 2017.07.31..
 */
@Service
@Transactional
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Iterable<Movie> findAll(){
        return movieRepository.findAll();
    }

    public Movie findById(int id){
        return movieRepository.findOne(id);
    }

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public void updateMovie(Movie movie, int id){
        Movie currentMovie = movieRepository.findOne(id);
        if(currentMovie.getId() == id){
            movieRepository.saveAndFlush(movie);
        }
    }

    public void deleteMovieById(int id){
        movieRepository.delete(id);
    }

}

