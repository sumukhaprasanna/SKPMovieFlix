package com.skp.movieflix.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skp.movieflix.api.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>{

}
