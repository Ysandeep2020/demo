package com.example.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.AppService;
import com.example.demo.util.LogExecutionTime;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

@RestController
public class UserController {

	@Autowired
	private AppService service;

	@LogExecutionTime
	@GetMapping("/add")
	public List<User> add() {
		List<User> list = null;
		/// LoggingExecutionTimeBySpringAOP/users.json
		File file = new File("users.json");
		try {
			list = service.setUserByJsonFile(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * this use for get all Users
	 * 
	 * @return
	 */
	public List<User> getUsers() {
		// TODO please map to Repository as soon as possible
		return Collections.emptyList();
	}
}
