package com.project.myimdb.repository;

import com.project.myimdb.model.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

}
