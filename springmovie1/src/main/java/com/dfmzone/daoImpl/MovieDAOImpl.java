package com.dfmzone.daoImpl;

import com.dfmzone.dao.MovieDAO;
import com.dfmzone.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class MovieDAOImpl implements MovieDAO{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @Override
    @Autowired
    public void setDataSource(DataSource dataSource) {
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public boolean create(Movie movie) {
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(movie);
        String query = "INSERT INTO movies (movie_name, movie_director, movie_description, movie_image) " +
                "VALUES(:name, :director, :description, :image)";
        return namedParameterJdbcTemplate.update(query, parameterSource) == 1;
    }

    @Override
    public Movie getMovie(String name) {
        SqlParameterSource parameterSource = new MapSqlParameterSource("name", name);
        String query = "SELECT * FROM movies WHERE movie_name= :name";
        return namedParameterJdbcTemplate.queryForObject(query, parameterSource, new MovieRowMapper());
    }

    @Override
    public List<Movie> getMovies() {
        String query = "SELECT * FROM movies";
        return namedParameterJdbcTemplate.query(query, new MovieRowMapper());
    }

    @Override
    public boolean delete(Movie movie) {
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(movie);
        String query = "DELETE FROM movies WHERE movie_name= :name";
        return namedParameterJdbcTemplate.update(query, parameterSource) == 1;
    }

    @Override
    public boolean update(Movie movie) {
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(movie);
        String query = "UPDATE movies SET movie_description  = :description WHERE id= :id";
        return namedParameterJdbcTemplate.update(query, parameterSource) == 1;
    }

    @Override
    public void cleanUp() {
        // TODO
    }
}
