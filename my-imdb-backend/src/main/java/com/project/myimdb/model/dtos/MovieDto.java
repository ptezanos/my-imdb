package com.project.myimdb.model.dtos;

import com.project.myimdb.model.entities.MovieEntity;
import com.project.myimdb.model.entities.PersonEntity;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
public class MovieDto {

    private String title;
    private String year;
    private String director;
    private String poster_url;
    private List<PersonDto> cast;

    public static MovieDto toMovieDto(MovieEntity movieEntity){
        return MovieDto.builder()
                .title(movieEntity.getTitle())
                .year(movieEntity.getYear())
                .director(movieEntity.getDirector())
                .poster_url(movieEntity.getPoster_url())
                .cast(toListPersonDto(movieEntity.getCast()))
                .build();
    }

    public static MovieDto toMovieDtoLimited(MovieEntity movieEntity){
        return MovieDto.builder()
                .title(movieEntity.getTitle())
                .year(movieEntity.getYear())
                .director(movieEntity.getDirector())
                .poster_url(movieEntity.getPoster_url())
                .build();
    }

    public static List<PersonDto> toListPersonDto(List<PersonEntity> personEntityList){
        return personEntityList.stream().map(PersonDto::toPersonDtoLimited).collect(Collectors.toList());
    }

}
