package com.keerthi.employeeservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.keerthi.employeeservice.dto.APIResponseDto;
import com.keerthi.employeeservice.dto.DepartmentDto;
import com.keerthi.employeeservice.dto.EmployeeDto;
import com.keerthi.employeeservice.entity.Employee;
import com.keerthi.employeeservice.mapper.EmployeeMapper;
import com.keerthi.employeeservice.repository.EmployeeRepository;
import com.keerthi.employeeservice.service.APIClient;
import com.keerthi.employeeservice.service.impl.EmployeeServiceImpl;

public class EmployeeServiceImplTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private APIClient apiClient;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveEmployee() {
        // Given
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setFirstName("John Doe");
        // Add other required fields

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        when(employeeRepository.save(any())).thenReturn(employee);

        // When
        EmployeeDto savedEmployeeDto = employeeService.saveEmployee(employeeDto);

        // Then
        assertEquals(employeeDto.getFirstName(), savedEmployeeDto.getFirstName());
        // Add assertions for other fields

        verify(employeeRepository, times(1)).save(any());
    }

    @Test
    void testGetEmployeeById() {
        // Given
        Long employeeId = 1L;
        Employee employee = new Employee();
        employee.setId(employeeId);
        // Add other required fields

        when(employeeRepository.findById(employeeId)).thenReturn(Optional.of(employee));

        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setDepartmentCode("IT");
        // Add other required fields

        when(apiClient.getDepartment(anyString())).thenReturn(departmentDto);

        // When
        APIResponseDto apiResponseDto = employeeService.getEmployeeById(employeeId);

        // Then
        assertEquals(employee.getId(), apiResponseDto.getEmployee().getId());
        // Add assertions for other fields

        verify(employeeRepository, times(1)).findById(employeeId);
        verify(apiClient, times(1)).getDepartment(anyString());
    }
}
