package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.Models.Student;
import com.example.jan24demospringboot.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepository repository;
    public String addStudent(Student student){
        repository.save(student);
        return "Student details added successfully...";
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }
    public Optional<Student> getStudentById(long id){

        return repository.findById(id);
    }

    public Optional<Student> getStudentByName(String name){
        return repository.findByName(name);
    }

    public Optional<Student> getStudentByRollNo(int rollNo){
        return repository.findByRollNo(rollNo);
    }

    public Optional<Student> getStudentByNameAndRollNo(String name,int rollNo){
        return repository.findByNameOrRollNo(name,rollNo);
    }

    public Optional<Student>getAll(){
        return repository.findAllNative();
    }

    public String  updateName(long id,String name){
        Student student=repository.getById(id);//select student from student_details where id is?

        student.setName(name); //update the name

        repository.save(student);//save the student name

        return "Student name saved successfully...";
    }

    public String removeStudent(long id){
        repository.deleteById(id);

        return id+"student removed successfully...";
    }
}
