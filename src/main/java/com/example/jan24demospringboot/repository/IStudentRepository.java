package com.example.jan24demospringboot.repository;

import com.example.jan24demospringboot.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IStudentRepository extends JpaRepository<Student,Long> {

}
