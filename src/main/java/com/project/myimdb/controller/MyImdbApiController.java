package com.project.myimdb.controller;

import com.project.myimdb.model.Movie;
import com.project.myimdb.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyImdbApiController {

    @GetMapping("/cast")
    public List<Person> getCast() {
        return retrieveCast();
    }

    @GetMapping("/director/{movieId}")
    public Person getDirector(@PathVariable String movieId) {
        return retrieveDirector(movieId);
    }

    @GetMapping("/persons/{personId}")
    public Person getPerson(@PathVariable String personId) {
        return retrievePerson(personId);
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovie(@PathVariable String movieId) {
        return retrieveMovie(movieId);
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return retrieveMovies();
    }

    @PostMapping("/rating/{movieId}")
    public void postRating(@PathVariable String movieId) {
        return sendRating(movieId);
    }

    @PostMapping("/comments/{movieId}")
    public void postComment(@PathVariable String movieId) {
        return sendComment(movieId);
    }

}
