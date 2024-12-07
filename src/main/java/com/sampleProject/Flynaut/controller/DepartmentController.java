package com.sampleProject.Flynaut.controller;

import com.sampleProject.Flynaut.dto.DepartmentDto;
import com.sampleProject.Flynaut.entity.Department;
import com.sampleProject.Flynaut.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping ("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public ResponseEntity<Department> addData(@RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentService.addData(departmentDto),CREATED);
    }
}
