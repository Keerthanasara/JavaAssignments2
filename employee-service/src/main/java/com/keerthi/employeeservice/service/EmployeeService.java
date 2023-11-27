package com.keerthi.employeeservice.service;

import com.keerthi.employeeservice.dto.APIResponseDto;
import com.keerthi.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
