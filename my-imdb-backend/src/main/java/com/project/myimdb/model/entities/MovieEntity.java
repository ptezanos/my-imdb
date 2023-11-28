package com.project.myimdb.model.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.myimdb.model.dtos.MovieDto;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "movies")
@Getter
public class MovieEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="release_year")
    private String year;

    @Column(name="director")
    private String director;

    @Column(name = "cast")
    @ManyToMany
//    @JsonManagedReference
    @JoinTable(
            name = "movie_casting",
            joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "id"))
    private List<PersonEntity> cast;

    @Column(name="poster_url")
    private String poster_url;

}
