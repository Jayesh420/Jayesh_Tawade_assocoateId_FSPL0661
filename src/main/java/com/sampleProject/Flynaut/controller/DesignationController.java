package com.sampleProject.Flynaut.controller;

import com.sampleProject.Flynaut.dto.DesignationDto;
import com.sampleProject.Flynaut.entity.Designation;
import com.sampleProject.Flynaut.service.DesignationService;
import jakarta.websocket.OnOpen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("/addDesignation")
    public ResponseEntity<Designation>addData(@RequestBody DesignationDto designationDto){
        return new ResponseEntity<>(designationService.addData(designationDto),CREATED);
    }

}
