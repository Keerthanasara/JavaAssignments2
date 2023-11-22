package com.springdemo.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springdemo.backend.model.Student;


	

	public interface Studentrepository extends MongoRepository<Student, String> {

		void deleteById(String studentIdToDelete);
	}


