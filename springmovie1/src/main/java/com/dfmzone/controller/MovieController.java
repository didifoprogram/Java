package com.dfmzone.controller;

import com.dfmzone.daoImpl.MovieDAOImpl;
import com.dfmzone.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class MovieController {

    @Autowired
    private MovieDAOImpl movieDAO;

    @RequestMapping("/")
    public String test(Model model) {

        return "index";
    }

    @RequestMapping("/movies")
    public String movies(Model model) {
        List<Movie> movies = movieDAO.getMovies();

        model.addAttribute("movieItem", movies);

        return "movies";
    }

    @RequestMapping(value = "/update/{name}")
    public String editMovie(@PathVariable String name, Model model, @ModelAttribute("update")Movie movie) {
        movie = movieDAO.getMovie(name);
        model.addAttribute("name", movie.getName());
        model.addAttribute("director", movie.getDirector());
        model.addAttribute("description", movie.getDescription());
        model.addAttribute("image", movie.getImage());

//        movieDAO.update(movie);
        return "update";
    }

    @RequestMapping(value = "/remove/{name}")
    public String removeMovie(@PathVariable String name) {
        Movie movie = movieDAO.getMovie(name);
        movieDAO.delete(movie);
        return "movies";
    }

    @RequestMapping("/{name}")
    public String movieTemp(@PathVariable String name, Model model) {

        Movie movie = movieDAO.getMovie(name);
        model.addAttribute("movieItem", movie);

        return "movieTemp";
    }

    @RequestMapping(value = "/newMovie", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("newMovie", "movie", new Movie());
    }

    @PostMapping(value = "/newMovie")
    public String newMovie(@ModelAttribute("movie") Movie movie,
                           BindingResult result,
                           ModelMap modelMap) {

        if (result.hasErrors()) {
            return "error";
        }

        modelMap.addAttribute("name", movie.getName());
        modelMap.addAttribute("director", movie.getDirector());
        modelMap.addAttribute("description", movie.getDescription());
        modelMap.addAttribute("image", movie.getImage());

        movieDAO.create(new Movie(movie.getName(), movie.getDirector(),
                movie.getDescription(), "/" + movie.getImage(), movie.getId()));

        return "newMovie";
    }


}
