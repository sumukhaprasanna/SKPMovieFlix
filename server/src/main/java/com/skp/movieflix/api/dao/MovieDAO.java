package com.skp.movieflix.api.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.skp.movieflix.api.entity.Movie;

@Repository
public class MovieDAO {

	private static Map<Integer, Movie> movies;
}
