package com.example.jan24demospringboot.repository;

import com.example.jan24demospringboot.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface IStudentRepository extends JpaRepository<Student,Long> {
    public Optional<Student> findByName(String name);

    public Optional<Student> findByRollNo(int rollNo);

    public Optional<Student> findByNameOrRollNo(String name,int rollNo);

    @Query(value = "SELECT * FROM student_details", nativeQuery = true)
    public Optional<Student>findAllNative();
}
