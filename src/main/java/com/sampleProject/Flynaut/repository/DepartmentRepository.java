package com.sampleProject.Flynaut.repository;

import com.sampleProject.Flynaut.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
