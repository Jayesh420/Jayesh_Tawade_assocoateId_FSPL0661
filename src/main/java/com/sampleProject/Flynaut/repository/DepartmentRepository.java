package com.sampleProject.Flynaut.repository;

import com.sampleProject.Flynaut.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<department, Integer> {
}
