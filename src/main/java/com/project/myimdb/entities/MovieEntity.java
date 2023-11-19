package com.project.myimdb.entities;

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

//    @ElementCollection
//    @CollectionTable(name = "persons", joinColumns = @JoinColumn(name = "id"))
//    @Column(name = "casting")
//    private List<String> cast;

    @Column(name="poster_url")
    private String poster_url;

}
