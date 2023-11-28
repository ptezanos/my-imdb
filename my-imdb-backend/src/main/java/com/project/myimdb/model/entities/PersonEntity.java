package com.project.myimdb.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "persons")
@Getter
public class PersonEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="person_name")
    private String name;

    @Column(name="age")
    private String age;

    @Column(name="photo_url")
    private String photo_url;

    @Column(name="movies")
    @ManyToMany(mappedBy = "cast")
//    @JsonBackReference
    private List<MovieEntity> movies;

}
