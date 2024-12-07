package com.sampleProject.Flynaut.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DesignationDto {
    private String designationName;

    private boolean isActive;
    private String CreateBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
