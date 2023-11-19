package com.project.myimdb.repository;

import com.project.myimdb.entities.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Long> {

}
