package com.sampleProject.Flynaut.repository;

import com.sampleProject.Flynaut.entity.designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<designation, Integer> {
}
