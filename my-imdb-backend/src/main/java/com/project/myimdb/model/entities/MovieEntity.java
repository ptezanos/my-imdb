package com.project.myimdb.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "movies")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    @JoinTable(
            name = "movie_casting",
            joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "person_id", referencedColumnName = "id"))
    private List<PersonEntity> cast;

    @Column(name="poster_url")
    private String poster_url;

    @Column(name="rating_counter")
    private Integer ratingCounter;

    @Column(name="rating_sum")
    private Integer ratingSum;

}
