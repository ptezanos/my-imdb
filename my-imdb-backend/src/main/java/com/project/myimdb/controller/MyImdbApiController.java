package com.project.myimdb.controller;

import com.project.myimdb.model.UserRating;
import com.project.myimdb.model.dtos.MovieDto;
import com.project.myimdb.model.dtos.PersonDto;
import com.project.myimdb.model.entities.MovieEntity;
import com.project.myimdb.model.entities.PersonEntity;
import com.project.myimdb.repository.MovieRepository;
import com.project.myimdb.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MyImdbApiController {

    private final MovieRepository movieRepository;
    private final PersonRepository personRepository;

    @CrossOrigin
    @GetMapping("/persons/{personId}")
    public PersonDto getPersonById(@PathVariable Long personId) {
        PersonEntity person = personRepository.findById(personId).orElse(null);
        return PersonDto.toPersonDto(person);
    }

    @CrossOrigin
    @GetMapping("/persons")
    public List<PersonDto> getPersons() {
        List<PersonEntity> persons = personRepository.findAll();
        return persons.stream().map(PersonDto::toPersonDto).collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/movies/{movieId}")
    public MovieDto getMovieById(@PathVariable Long movieId) {
        MovieEntity movie = movieRepository.findById(movieId).orElse(null);
        return MovieDto.toMovieDto(movie);
    }

    @CrossOrigin
    @GetMapping("/movies")
    public List<MovieDto> getMovies() {
        List<MovieEntity> movies = movieRepository.findAll();
        return movies.stream().map(MovieDto::toMovieDto).collect(Collectors.toList());
    }

    @CrossOrigin
    @PostMapping("/movies/{movieId}")
    public BigDecimal postRating(@PathVariable String movieId, @RequestBody UserRating userRating) {
        System.out.println("Received user rating:" + userRating.getRating());
//        return null;
        return BigDecimal.valueOf(userRating.getRating());
    }


}
