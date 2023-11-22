package com.springmongo.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.backend.entity.Student;
import com.springmongo.backend.service.Studentservice;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/v1/student")
public class Studentcontroller {

	@Autowired
	private Studentservice studentservices;
	
	@PostMapping(value="/save")
	private String	saveStudent(@RequestBody Student students) {
		studentservices.saveorupdate(students);
		return students.getId();
	}
	
	@GetMapping(value="/getall")
	private Iterable<Student>getstudents() {
		return studentservices.listall();
	}
	
	@PutMapping(value="/edit/{id}")
	private Student update(@RequestBody Student student,@PathVariable(name="id")String id) {
		student.setId(id);
		studentservices.saveorupdate(student);
		return student;
	}
	
	@DeleteMapping(value="/delete/{id}")
	private void delete(@PathVariable(name="id")String id) {
		
		studentservices.delete(id);
		
	}
	@RequestMapping("/student/{id}")
	private Student getstudent(@PathVariable(name="id")String studentid ) {
		return studentservices.getstudentbyid(studentid);
	}
	
	
}