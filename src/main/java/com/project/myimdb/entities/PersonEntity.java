package com.project.myimdb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class PersonEntity {

    @Id
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String age;

    @Column
    private String photo_url;

}
