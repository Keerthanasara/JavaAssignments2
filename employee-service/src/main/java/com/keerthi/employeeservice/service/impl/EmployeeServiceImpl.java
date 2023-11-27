package com.keerthi.employeeservice.service.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.keerthi.employeeservice.dto.APIResponseDto;
import com.keerthi.employeeservice.dto.DepartmentDto;
import com.keerthi.employeeservice.dto.EmployeeDto;
import com.keerthi.employeeservice.entity.Employee;
import com.keerthi.employeeservice.mapper.EmployeeMapper;
import com.keerthi.employeeservice.repository.EmployeeRepository;
import com.keerthi.employeeservice.service.APIClient;
import com.keerthi.employeeservice.service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService {
	

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private EmployeeRepository employeeRepository;
@Autowired
    private APIClient apiClient;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee saveDEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(saveDEmployee);

        return savedEmployeeDto;
    }

    //@CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
   // @Retry(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
 @Override
  public APIResponseDto getEmployeeById(Long employeeId) {

      Employee employee = employeeRepository.findById(employeeId).get();

   
   DepartmentDto departmentDto = apiClient.getDepartment(employee.getDepartmentCode());

    EmployeeDto employeeDto = EmployeeMapper.mapToEmployeeDto(employee);

       APIResponseDto apiResponseDto = new APIResponseDto();
      apiResponseDto.setEmployee(employeeDto);       
      apiResponseDto.setDepartment(departmentDto);

     return apiResponseDto;
   }



}
