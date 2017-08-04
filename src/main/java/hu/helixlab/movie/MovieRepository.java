package hu.helixlab.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by Admin on 2017.07.31..
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Serializable> {

 //   List<Movie> findById(int id);
}
