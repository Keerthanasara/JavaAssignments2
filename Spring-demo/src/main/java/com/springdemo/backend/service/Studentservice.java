package com.springdemo.backend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.backend.model.Student;
import com.springdemo.backend.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentservice {
	  @Autowired
	    private Studentrepository studentRepository;
	 
	        @Autowired
	    	private Studentrepository studentrepo;
	        
	    	public void saveorupdate(Student students) {
	    	studentrepo.save(students)	;
	    		
	    	}
	    	public Iterable<Student> listall() {

	    		return this.studentrepo.findAll();
	    	}
	    	
	    	public void delete(String id) {
	    	studentrepo.deleteById(id);
	    		
	    	}
	    
	    

	}
