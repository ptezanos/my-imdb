package com.project.myimdb.controller;

import com.project.myimdb.model.MovieRating;
import com.project.myimdb.model.UserRating;
import com.project.myimdb.model.dtos.MovieDto;
import com.project.myimdb.model.dtos.PersonDto;
import com.project.myimdb.model.entities.MovieEntity;
import com.project.myimdb.model.entities.PersonEntity;
import com.project.myimdb.repository.MovieRepository;
import com.project.myimdb.repository.PersonRepository;
import com.project.myimdb.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MyImdbApiController {

    private final MovieRepository movieRepository;
    private final PersonRepository personRepository;
    private final MovieService movieService;

    @CrossOrigin
    @GetMapping("/persons/{personId}")
    public PersonDto getPersonById(@PathVariable Long personId) {
        PersonEntity person = this.personRepository.findById(personId).orElse(null);
        return PersonDto.toPersonDto(person);
    }

    @CrossOrigin
    @GetMapping("/persons")
    public List<PersonDto> getPersons() {
        List<PersonEntity> persons = this.personRepository.findAll();
        return persons.stream().map(PersonDto::toPersonDto).collect(Collectors.toList());
    }

    @CrossOrigin
    @GetMapping("/movies/{movieId}")
    public MovieDto getMovieById(@PathVariable Long movieId) {
        MovieEntity movie = this.movieRepository.findById(movieId).orElse(null);
        return MovieDto.toMovieDto(movie);
    }

    @CrossOrigin
    @GetMapping("/movies")
    public List<MovieDto> getMovies() {
        List<MovieEntity> movies = this.movieRepository.findAll();
        return movies.stream().map(MovieDto::toMovieDto).collect(Collectors.toList());
    }

    @CrossOrigin
    @PostMapping("/movies/{movieId}")
    public MovieRating postRating(@PathVariable String movieId, @RequestBody UserRating userRating) {
        Long movieIdLong = Long.valueOf(movieId);
        Integer rating = userRating.getRating();
        System.out.println("Received user rating:" + rating);
        this.movieService.updateRating(movieIdLong, rating);
        MovieEntity updatedMovie = this.movieRepository.findById(movieIdLong).orElse(null);
        MovieRating movieRating = MovieRating.builder()
                .ratingCounter(updatedMovie.getRatingCounter())
                .ratingSum(updatedMovie.getRatingSum())
                .build();
        System.out.println("Sending the following movieRating:" + movieRating.toString());
        return movieRating;
    }


}
