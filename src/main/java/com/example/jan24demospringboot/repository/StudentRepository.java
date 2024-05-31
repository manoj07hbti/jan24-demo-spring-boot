package com.example.jan24demospringboot.repository;

import com.example.jan24demospringboot.model.StudentTable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<StudentTable,Long> {


}
