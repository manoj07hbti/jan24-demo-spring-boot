package com.example.jan24demospringboot.repository;

import com.example.jan24demospringboot.model.EmployeeUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeUpdateRepository extends JpaRepository<EmployeeUpdate , Long> {
}
