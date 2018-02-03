package com.dfmzone.daoImpl;

import com.dfmzone.domain.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<Movie>{

    @Override
    public Movie mapRow(ResultSet resultSet, int i) throws SQLException {

        Movie movie = new Movie();
        movie.setId(resultSet.getInt("movie_id"));
        movie.setName(resultSet.getString("movie_name"));
        movie.setDirector(resultSet.getString("movie_director"));
        movie.setDescription(resultSet.getString("movie_description"));
        movie.setImage(resultSet.getString("movie_image"));

        return movie;
    }
}
