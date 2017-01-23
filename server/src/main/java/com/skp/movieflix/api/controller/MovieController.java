package com.skp.movieflix.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skp.movieflix.api.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping(value="/movie", method=RequestMethod.GET)
	public Object index(){
		return movieService.findAll();
	}
	
}
