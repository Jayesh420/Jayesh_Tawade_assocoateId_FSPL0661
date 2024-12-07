package com.sampleProject.Flynaut.service;

import com.sampleProject.Flynaut.dto.DepartmentDto;
import com.sampleProject.Flynaut.entity.Department;
import com.sampleProject.Flynaut.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department addData(DepartmentDto departmentDto)
    {
        Department department =new Department();
       // department.setDeptId(0L);
        department.setDeptName(departmentDto.getDeptName());

        department.setActive(true);
        department.setCreateBy(departmentDto.getCreateBy());
        department.setUpdatedBy(departmentDto.getUpdatedBy());

        return departmentRepository.save(department);
    }
}
