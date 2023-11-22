package com.springdemo.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.springdemo.backend.model.Student;
import com.springdemo.backend.service.Studentservice;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/v1/student")
public class Studentscontroller {

	Logger log= LoggerFactory.getLogger(Studentscontroller.class);





	@Autowired
	private Studentservice studentservices;
	
	@PostMapping(value="/save") 
	public String	saveStudent(@RequestBody Student students) {
		studentservices.saveorupdate(students);
		log.info("added details");
		return students.getId();
	}
	

	@DeleteMapping(value="/delete/{id}") 
	public void delete(@PathVariable(name="id")String id) {
		
		studentservices.delete(id);
		log.info("deleted details of "+id);
	}
	@GetMapping(value="/getall") 
	public Iterable<Student>getstudents() {
		log.info("listed details");
		return studentservices.listall();
	}
}
	
