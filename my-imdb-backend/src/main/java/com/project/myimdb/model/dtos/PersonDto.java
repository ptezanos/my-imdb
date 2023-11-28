package com.project.myimdb.model.dtos;

import com.project.myimdb.model.entities.MovieEntity;
import com.project.myimdb.model.entities.PersonEntity;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
public class PersonDto {


    private Long personId;
    private String name;
    private String age;
    private String photo_url;
    private List<MovieDto> movies;

    public static PersonDto toPersonDto(PersonEntity personEntity){
        return PersonDto.builder()
                .personId(personEntity.getId())
                .name(personEntity.getName())
                .age(personEntity.getAge())
                .photo_url(personEntity.getPhoto_url())
                .movies(toListMovieDto(personEntity.getMovies()))
                .build();
    }

    public static PersonDto toPersonDtoLimited(PersonEntity personEntity){
        return PersonDto.builder()
                .personId(personEntity.getId())
                .name(personEntity.getName())
                .age(personEntity.getAge())
                .photo_url(personEntity.getPhoto_url())
                .build();
    }

    public static List<MovieDto> toListMovieDto(List<MovieEntity> movieEntityList){
        return movieEntityList.stream().map(MovieDto::toMovieDtoLimited).collect(Collectors.toList());
    }

}
