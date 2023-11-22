package com.springmongo.backend.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongo.backend.entity.Student;

public interface Studentrepo extends MongoRepository<Student, String> {

}
