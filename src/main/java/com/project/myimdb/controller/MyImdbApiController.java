package com.project.myimdb.controller;

import com.project.myimdb.entities.MovieEntity;
import com.project.myimdb.entities.PersonEntity;
import com.project.myimdb.model.Movie;
import com.project.myimdb.model.Person;
import com.project.myimdb.repository.MovieRepository;
import com.project.myimdb.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyImdbApiController {

    private final MovieRepository movieRepository;
    private final PersonRepository personRepository;

//    @GetMapping("/cast")
//    public List<Person> getCast() {
//        RestTemplate restTemplate = new RestTemplate();
//        return retrieveCast();
//    }
//
//    @GetMapping("/director/{movieId}")
//    public Person getDirector(@PathVariable String movieId) {
//        return retrieveDirector(movieId);
//    }

    @GetMapping("/persons/{personId}")
    public PersonEntity getPerson(@PathVariable Long personId) {
        return personRepository.findById(personId).orElse(null);
    }

    @GetMapping("/movies/{movieId}")
    public MovieEntity getMovie(@PathVariable Long movieId) {
        return movieRepository.findById(movieId).orElse(null);
    }

//    @GetMapping("/movies")
//    public List<Movie> getMovies() {
//        return retrieveMovies();
//    }
//
//    @PostMapping("/rating/{movieId}")
//    public void postRating(@PathVariable String movieId) {
//        return sendRating(movieId);
//    }
//
//    @PostMapping("/comments/{movieId}")
//    public void postComment(@PathVariable String movieId) {
//        return sendComment(movieId);
//    }

}
