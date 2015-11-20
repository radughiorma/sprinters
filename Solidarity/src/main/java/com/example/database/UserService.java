package com.example.database;

public interface UserService {

	User findByName(String name);

	String getById(int id);
}
