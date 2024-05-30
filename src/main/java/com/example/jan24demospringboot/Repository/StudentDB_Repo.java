package com.example.jan24demospringboot.Repository;

import com.example.jan24demospringboot.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDB_Repo extends JpaRepository<Student,Long> {
}
