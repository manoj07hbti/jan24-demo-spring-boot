package com.example.jan24demospringboot.repository;

import com.example.jan24demospringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByName(String name);

    public Student findByNameAndRollNo(String name,int rollNo);

    public Student findByNameOrRollNo(String name,int rollNo);


    @Query(value = "SELECT * FROM STUDENT_JAN24_JAVA",nativeQuery = true)
    public List<Student> findAllNative();

    @Query(value = "SELECT * FROM STUDENT_JAN24_JAVA WHERE NAME=:name",nativeQuery = true)
    public Student findByNameNative(@Param("name") String name);


    @Query(value = "SELECT * FROM STUDENT_JAN24_JAVA WHERE NAME=:name and ROLL_NO=:rollNo",nativeQuery = true)
    public Student findByNameRollNoNative(@Param("name") String name,@Param("rollNo") int rollNo);
}
