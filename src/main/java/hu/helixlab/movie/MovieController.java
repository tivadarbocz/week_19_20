package hu.helixlab.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Admin on 2017.07.30..
 */
@CrossOrigin(origins = "http://localhost:8080, http://localhost:8081", maxAge = 3600, allowedHeaders = "POST, GET, PUT, OPTIONS, DELETE")
@RestController
@RequestMapping(path = "/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<Movie> getMovie(){
        return movieService.findAll();
    }

    @RequestMapping(path="/{id}", method = RequestMethod.GET, produces =  MediaType.APPLICATION_JSON_VALUE)
    Movie getMovieById(@PathVariable int id){

        return movieService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    Movie createMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }

    @RequestMapping( path="/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    void updateMovieById(@PathVariable int id, @RequestBody Movie movie){
        movieService.updateMovie(movie, id);
    }

    @RequestMapping( path = "/{id}", method = RequestMethod.DELETE)
    void deleteById(@PathVariable int id){
        movieService.deleteMovieById(id);
    }
}
