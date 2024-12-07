package com.sampleProject.Flynaut.controller;

import com.sampleProject.Flynaut.dto.EmployeeDto;
import com.sampleProject.Flynaut.entity.Employee;
import com.sampleProject.Flynaut.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/employeemanagement")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
   public ResponseEntity<Employee> addData(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.addData(employeeDto),CREATED);
    }
}
