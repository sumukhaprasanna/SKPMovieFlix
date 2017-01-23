package com.skp.movieflix.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses={com.skp.movieflix.api.entity.User.class,com.skp.movieflix.api.entity.Movie.class})
public class SkpMovieflixApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkpMovieflixApiApplication.class, args);
	}
}
