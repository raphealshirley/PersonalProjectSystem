package com.pps.pps.repositories;

import com.pps.pps.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProjectRepository implements CrudRepository<Project, Long> {

  @Override
  public <S extends Project> S save(S s) {
    return null;
  }

  @Override
  public <S extends Project> Iterable<S> saveAll(Iterable<S> iterable) {
    return null;
  }

  @Override
  public Optional<Project> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public Iterable<Project> findAll() {
    return null;
  }

  @Override
  public Iterable<Project> findAllById(Iterable<Long> iterable) {
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
  public void delete(Project project) {

  }

  @Override
  public void deleteAll(Iterable<? extends Project> iterable) {

  }

  @Override
  public void deleteAll() {

  }
}
