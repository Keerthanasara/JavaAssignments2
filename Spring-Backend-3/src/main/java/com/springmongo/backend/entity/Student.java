package com.springmongo.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "students")
public class Student {
@Id
private String id;
@Field
private String studentname;
@Field
private String studentaddress;
@Field
private String mobile;

public Student(String id, String studentname, String studentaddress, String mobile) {
	super();
	this.id = id;
	this.studentname = studentname;
	this.studentaddress = studentaddress;
	this.mobile = mobile;
}
public Student() {
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentaddress() {
	return studentaddress;
}
public void setStudentaddress(String studentaddress) {
	this.studentaddress = studentaddress;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Student [id=" + id + ", studentname=" + studentname + ", studentaddress=" + studentaddress + ", mobile="
			+ mobile + "]";
}


}
