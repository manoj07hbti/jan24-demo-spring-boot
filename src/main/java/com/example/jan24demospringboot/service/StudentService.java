package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.StudentTable;
import com.example.jan24demospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public String addStudent(StudentTable student){
        repository.save(student);
        return "student saved";
    }

    public List<StudentTable> getStudents(){
        return repository.findAll();
    }

    public String updateName(long id, String newName){
        StudentTable student = repository.getById(id);
        student.setName(newName);
        repository.save(student);
        return "Student name updated to "+newName;
    }

    public String updateRollNo(long id, int newRoll){
        StudentTable studentTable = repository.getById(id);
        studentTable.setRollNo(newRoll);
        repository.save(studentTable);
        return "Student roll no updated";
    }

    public String updateSection(long id, String newSection){
        StudentTable student = repository.getById(id);
        student.setSection(newSection);
        repository.save(student);
        return "Student section updated to "+newSection;
    }

    public String updateStudent(long id, String name, int rollNo, String section){
        StudentTable studentTable = repository.getById(id);
        studentTable.setName(name);
        studentTable.setSection(section);
        studentTable.setRollNo(rollNo);
        repository.save(studentTable);
        return "student updated..";
    }


    public String removeStudent(long id){
        repository.deleteById(id);
        return  "Student removed successfully";
    }
}
