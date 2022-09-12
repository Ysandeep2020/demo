package com.example.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class User {

	private int id;
	private String name;
	private String pass;
	private String email;
	private int age;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User(int id, String name, String pass, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.age = age;
	}

}
