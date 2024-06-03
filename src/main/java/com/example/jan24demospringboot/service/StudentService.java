package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.Student;
import com.example.jan24demospringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public String addStudent(Student student){

        repository.save(student);// insert INto student quarry
        return "Student added to the DATABASE successfully...";
    }
    public List<Student> getAllStudent(){

       return repository.findAll(); //select * form table..
    }

    public String updateName(String newName, long id){
        //find record from database
         Student student =  repository.getById(id);// select * from STUDENT_DB_TABLE where id=2
        //update the name with the help of setter method
         student.setName(newName);
         // save back to the database...again


        repository.save(student);

        return "Name "+newName+ "updated successfully";


    }

    public String removeStudent(long id ){
        repository.deleteById(id);//delete from table where id =2

        return "Date remove successfully...";
    }

}
