package com.sampleProject.Flynaut.service;

import com.sampleProject.Flynaut.dto.EmployeeDto;
import com.sampleProject.Flynaut.entity.Employee;
import com.sampleProject.Flynaut.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addData(EmployeeDto employeeDto) {
        Employee employee =new Employee();
      //  employee.setEmployeeId(0L);
        employee.setEmployeeName(employeeDto.getEmployeeName());
        employee.setEmailId(employeeDto.getEmailId());
        employee.setSalary(employeeDto.getSalary());

        employee.setActive(true);
        employee.setCreateBy(employeeDto.getCreateBy());
        employee.setCreatedDate(LocalDateTime.now());
        employee.setUpdatedBy(employeeDto.getUpdatedBy());
        employee.setUpdatedDate(LocalDateTime.now());

        return employeeRepository.save(employee);
    }
}

