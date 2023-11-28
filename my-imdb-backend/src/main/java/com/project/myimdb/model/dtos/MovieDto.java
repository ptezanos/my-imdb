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
    private List<PersonDto> cast;
    private String poster_url;

    public static MovieDto toMovieDto(MovieEntity movieEntity){
        return MovieDto.builder()
                .title(movieEntity.getTitle())
                .year(movieEntity.getYear())
                .director(movieEntity.getDirector())
                .cast(toListPersonDto(movieEntity.getCast()))
                .poster_url(movieEntity.getPoster_url())
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
