package com.dfmzone.dao;

import com.dfmzone.domain.Movie;

import javax.sql.DataSource;
import java.util.List;

public interface MovieDAO {

    void setDataSource(DataSource dataSource);

    boolean create(Movie movie);

    Movie getMovie(String name);

    List<Movie> getMovies();

    boolean delete(Movie movie);

    boolean update(Movie movie);

    void cleanUp();
}
