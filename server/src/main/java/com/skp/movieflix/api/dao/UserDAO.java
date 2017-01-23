package com.skp.movieflix.api.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.skp.movieflix.api.entity.User;

@Repository
public class UserDAO {

	private static Map<Integer, User> users;
}
