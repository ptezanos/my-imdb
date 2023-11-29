package com.project.myimdb.service;

import com.project.myimdb.model.entities.MovieEntity;
import com.project.myimdb.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MovieService {

    private final MovieRepository movieRepository;

    @Transactional
    public void updateRating(Long movieId, Integer userRating) {
        try {
            MovieEntity movieEntity = movieRepository.findById(movieId).orElseThrow(Exception::new);
            Integer newRatingCounter = movieEntity.getRatingCounter() + 1;
            System.out.println("New counter: " + newRatingCounter);
            Integer newRatingSum = movieEntity.getRatingSum() + userRating;
            System.out.println("New sum: " + newRatingSum);
            MovieEntity newMovieEntity = MovieEntity.builder()
                    .id(movieEntity.getId())
                    .title(movieEntity.getTitle())
                    .year(movieEntity.getYear())
                    .director(movieEntity.getDirector())
                    .cast(movieEntity.getCast())
                    .poster_url(movieEntity.getPoster_url())
                    .ratingCounter(newRatingCounter)
                    .ratingSum(newRatingSum)
                    .build();
            movieRepository.saveAndFlush(newMovieEntity);
        } catch(Exception e) {
            log.info("Exception with message: " + e.getMessage());
            }
    }

    @Transactional
    public MovieEntity updateRatingAndRetrieve(Long movieId, Integer newRating) {
        updateRating(movieId, newRating);

        MovieEntity updatedMovie = movieRepository.findById(movieId).orElse(null);

        return updatedMovie;
    }

}
