package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.Student;
import com.example.jan24demospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public String addStudent(Student student){

        repository.save(student);// INSERT INTO STUDENT ...
        return "Student added  to the DB";
    }

    public List<Student> getAllStudent(){

        return repository.findAll();// select * from table
    }

    public Optional<Student> getStudent(long id){

        return repository.findById(id);// select * from table where id=?
    }

    public Optional<Student> getStudentByName(String name){
         return Optional.ofNullable(repository.findByName(name));// //select * from table where name=?

    }
    public Optional<Student> getStudentByNameRoll(String name,int rollNo){
        return Optional.ofNullable(repository.findByNameAndRollNo(name,rollNo));// //select * from table where name=?

    }

    public String updateName(String newName, long id){

         // find record from db
       Student student=   repository.getById(id);  //select * from STUDENT_JAN24_JAVA where id=101
         // update the name with the help of setter method
        student.setName(newName);
        // save back to the database again
        repository.save(student);

        return "Name " +newName+ "updates successfully ";
    }

    public String removeStudent(long id){

        repository.deleteById(id);// delete from table where id=

        return "Data removed successfully...";
    }
}
