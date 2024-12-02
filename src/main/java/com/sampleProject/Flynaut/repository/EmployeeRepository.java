package com.sampleProject.Flynaut.repository;

import com.sampleProject.Flynaut.entity.empl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<empl,Long> {
}
