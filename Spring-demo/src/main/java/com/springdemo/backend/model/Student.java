package com.springdemo.backend.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
	   private 	String id;
   
	private String name;
    private int age;
    private double salary;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
