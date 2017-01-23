package com.skp.movieflix.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skp.movieflix.api.entity.Movie;
import com.skp.movieflix.api.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	public Object findAll(){
		return movieRepo.findAll();
	}
		
	public Movie save(Movie movie){
		return movieRepo.save(movie);
	}
	
	public void delete(Movie movie){
		movieRepo.delete(movie);
	}
}
