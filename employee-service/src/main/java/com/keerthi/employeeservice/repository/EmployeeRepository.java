package com.keerthi.employeeservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthi.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
