package com.sampleProject.Flynaut.repository;

import com.sampleProject.Flynaut.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
