package com.springdemo.backend.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springdemo.backend.model.Student;
import com.springdemo.backend.repository.Studentrepository;

@ExtendWith(MockitoExtension.class)
class StudentserviceTest {

    @Mock
    private Studentrepository studentRepository;

    @Mock
    private Studentrepository studentrepo;

    @InjectMocks
    private Studentservice studentService;

    @Test
    void testSaveOrUpdate() {
        // Arrange
        Student studentToSave = new Student("1","keerthi",12,9000.00);

        // Act
        studentService.saveorupdate(studentToSave);

        // Assert
        verify(studentrepo, times(1)).save(studentToSave);
    }

    @Test
    void testListAll() {
        // Arrange
        List<Student> students = Arrays.asList(
                new Student("2","keerthu",12,9000.00),
                new Student("3","keertho",12,9000.00)
                // Add more students as needed
        );

        when(studentrepo.findAll()).thenReturn(students);

        // Act
        Iterable<Student> result = studentService.listall();

        // Assert
        assertEquals(students, result);
    }

    @Test
    void testDelete() {
        // Arrange
        String studentIdToDelete = "1";

        // Act
        studentService.delete(studentIdToDelete);

        // Assert
        verify(studentrepo, times(1)).deleteById(studentIdToDelete);
    }
}
