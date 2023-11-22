package com.springmongo.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springmongo.backend.entity.Student;
import com.springmongo.backend.repo.Studentrepo;

@Service
public class Studentservice {

	@Autowired
	private Studentrepo studentrepo;
	public void saveorupdate(Student students) {
	studentrepo.save(students)	;
		
	}
	public Iterable<Student> listall() {

		return this.studentrepo.findAll();
	}
	public void delete(String id) {
	studentrepo.deleteById(id);
		
	}
	public Student getstudentbyid(String studentid) {
	return studentrepo.findById(studentid).get();
	
	}

	
}
