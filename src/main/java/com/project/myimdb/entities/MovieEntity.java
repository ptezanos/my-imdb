package com.project.myimdb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "movies")
public class MovieEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="year")
    private String year;

    @Column(name="director")
    private String directorByPersonId;

    @ElementCollection
    @CollectionTable(name = "persons", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "cast")
    private List<String> cast;

    @Column(name="poster_url")
    private String poster_url;

}
