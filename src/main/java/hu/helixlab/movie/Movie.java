package hu.helixlab.movie;

import javax.persistence.*;

/**
 * Created by Admin on 2017.07.31..
 */
@Entity
//@Table(name = "movie", schema = "public")
public class Movie {
    private int id;
    private String name;
    private String type;
    private Integer length;
    private Integer ageLimit;

    public Movie() {
    }

    @Id
    @Column(name = "id", nullable = true, insertable = true, updatable = true)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type", nullable = true, insertable = true, updatable = true, length = 30)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "length", nullable = true, insertable = true, updatable = true)
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Basic
    @Column(name = "age_limit", nullable = true, insertable = true, updatable = true)
    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (id != movie.id) return false;
        if (name != null ? !name.equals(movie.name) : movie.name != null) return false;
        if (type != null ? !type.equals(movie.type) : movie.type != null) return false;
        if (length != null ? !length.equals(movie.length) : movie.length != null) return false;
        if (ageLimit != null ? !ageLimit.equals(movie.ageLimit) : movie.ageLimit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (ageLimit != null ? ageLimit.hashCode() : 0);
        return result;
    }
}
