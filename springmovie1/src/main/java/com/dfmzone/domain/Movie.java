package com.dfmzone.domain;

import java.util.Objects;

public class Movie {

    private String name;
    private String director;
    private String description;
    private String image;
    private Integer id;

    public Movie(String name, String director, String description, String image, Integer id) {
        this.name = name;
        this.director = director;
        this.description = description;
        this.image = image;
        this.id = id;
    }

    public Movie() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) &&
                Objects.equals(director, movie.director) &&
                Objects.equals(description, movie.description) &&
                Objects.equals(image, movie.image);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, director, description, image);
    }
}
