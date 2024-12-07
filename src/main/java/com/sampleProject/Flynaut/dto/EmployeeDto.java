package com.sampleProject.Flynaut.dto;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class EmployeeDto {
    private String employeeName;
    private String emailId;
    private double salary;

    private boolean isActive;
    private String CreateBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
