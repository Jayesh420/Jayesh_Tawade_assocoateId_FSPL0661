package com.sampleProject.Flynaut.service;

import com.sampleProject.Flynaut.dto.DepartmentDto;
import com.sampleProject.Flynaut.dto.DesignationDto;
import com.sampleProject.Flynaut.entity.Department;
import com.sampleProject.Flynaut.entity.Designation;
import com.sampleProject.Flynaut.repository.DepartmentRepository;
import com.sampleProject.Flynaut.repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DesignationService {
@Autowired
    DesignationRepository designationRepository;

    public Designation addData(DesignationDto designationDto){
        Designation designation =new Designation();
        designation.setDesignationName(designationDto.getDesignationName());

        designation.setActive(true);
        designation.setCreateBy(designationDto.getCreateBy());
        designation.setUpdatedBy(designationDto.getUpdatedBy());
        designation.setUpdatedDate(LocalDateTime.now());

        return designationRepository.save(designation);
    }
}
