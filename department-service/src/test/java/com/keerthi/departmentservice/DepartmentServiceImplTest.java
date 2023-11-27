package com.keerthi.departmentservice;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.keerthi.departmentservice.dto.DepartmentDto;
import com.keerthi.departmentservice.entity.Department;
import com.keerthi.departmentservice.mapper.DepartmentMapper;
import com.keerthi.departmentservice.repository.DepartmentRepository;
import com.keerthi.departmentservice.service.impl.DepartmentServiceImpl;

@SpringBootTest
public class DepartmentServiceImplTest {

    private DepartmentRepository departmentRepository;
    private DepartmentServiceImpl departmentService;

    @BeforeEach
    void setUp() {
        departmentRepository = mock(DepartmentRepository.class);
        departmentService = new DepartmentServiceImpl(departmentRepository);
    }

    @Test
    void testSaveDepartment() {
        // Given
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setDepartmentCode("IT");
        departmentDto.setDepartmentName("Information Technology");

        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        when(departmentRepository.save(any())).thenReturn(department);

        // When
        DepartmentDto savedDepartmentDto = departmentService.saveDepartment(departmentDto);

        // Then
        assertEquals(departmentDto.getDepartmentCode(), savedDepartmentDto.getDepartmentCode());
        assertEquals(departmentDto.getDepartmentName(), savedDepartmentDto.getDepartmentName());
        verify(departmentRepository, times(1)).save(any());
    }

    @Test
    void testGetDepartmentByCode() {
        // Given
        String departmentCode = "IT";
        Department department = new Department();
        department.setDepartmentCode(departmentCode);
        department.setDepartmentName("Information Technology");

        when(departmentRepository.findByDepartmentCode(departmentCode)).thenReturn(department);

        // When
        DepartmentDto retrievedDepartmentDto = departmentService.getDepartmentByCode(departmentCode);

        // Then
        assertEquals(department.getDepartmentCode(), retrievedDepartmentDto.getDepartmentCode());
        assertEquals(department.getDepartmentName(), retrievedDepartmentDto.getDepartmentName());
        verify(departmentRepository, times(1)).findByDepartmentCode(departmentCode);
    }
}
