package com.example.demo.service;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AppService {

	// @LogExecutionTime
	public List<User> setUserByJsonFile(File file) throws StreamReadException, DatabindException, IOException {
		if (file == null) {
			return Collections.emptyList();
		}
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(file.getUsableSpace());
		List<User> readValue = mapper.readValue(file, new TypeReference<List<User>>() {
		});
		System.out.println(readValue);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return readValue;
	}

	public String setUser() {
		return "Added";
	}

}
