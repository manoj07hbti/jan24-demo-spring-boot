package com.example.jan24demospringboot.repository;

import com.example.jan24demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
