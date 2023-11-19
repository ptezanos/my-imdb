package com.project.myimdb.repository;

import com.project.myimdb.entities.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MovieRepository implements CrudRepository<MovieEntity, Long> {

    @Override
    public <S extends MovieEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends MovieEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<MovieEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<MovieEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<MovieEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(MovieEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends MovieEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
