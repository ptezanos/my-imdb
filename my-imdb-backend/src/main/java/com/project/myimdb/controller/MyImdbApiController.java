package com.project.myimdb.controller;

import com.project.myimdb.model.dtos.MovieDto;
import com.project.myimdb.model.dtos.PersonDto;
import com.project.myimdb.model.entities.MovieEntity;
import com.project.myimdb.model.entities.PersonEntity;
import com.project.myimdb.repository.MovieRepository;
import com.project.myimdb.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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

    @CrossOrigin
    @GetMapping("/persons/{personId}")
    public PersonEntity getPersonById(@PathVariable Long personId) {
        return personRepository.findById(personId).orElse(null);
    }

    @CrossOrigin
    @GetMapping("/persons")
    public List<PersonDto> getPersons() {
        List<PersonEntity> persons = personRepository.findAll();
        return persons.stream().map(PersonDto::toPersonDto).collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/movies/{movieId}")
    public MovieEntity getMovieById(@PathVariable Long movieId) {
        return movieRepository.findById(movieId).orElse(null);
    }

    @CrossOrigin
    @GetMapping("/movies")
    public List<MovieDto> getMovies() {
        List<MovieEntity> movies = movieRepository.findAll();
        return movies.stream().map(MovieDto::toMovieDto).collect(Collectors.toList());
    }

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
