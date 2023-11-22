package com.springdemo.backend.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.springdemo.backend.model.Student;
import com.springdemo.backend.service.Studentservice;

@ExtendWith(MockitoExtension.class)
class StudentscontrollerTest {

    @Mock
    private Studentservice studentservice;

    @InjectMocks
    private Studentscontroller studentscontroller;

    @BeforeEach
    void setUp() {
        // You can do additional setup here if needed
    }

    @Test
    void testSaveStudent() {
        // Arrange
        Student studentToSave = new Student(/* initialize student data */);

        // Act
        String result = studentscontroller.saveStudent(studentToSave);

        // Assert
        assertEquals(studentToSave.getId(), result.getBytes());
        verify(studentservice, times(1)).saveorupdate(studentToSave);
    }

    @Test
    void testDelete() {
        // Arrange
        String studentIdToDelete = "1";

        // Act
        studentscontroller.delete(studentIdToDelete);

        // Assert
        verify(studentservice, times(1)).delete(studentIdToDelete);
    }

    @Test
    void testGetStudents() {
        // Arrange
        List<Student> students = Arrays.asList(
                new Student(/* initialize student data */),
                new Student(/* initialize student data */)
                // Add more students as needed
        );

        when(studentservice.listall()).thenReturn(students);

        // Act
        Iterable<Student> result = studentscontroller.getstudents();

        // Assert
        assertEquals(students, result);
    }
}
