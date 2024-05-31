package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.College;
import com.example.jan24demospringboot.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    CollegeRepository repository;

    public String addCollege(College college){
        repository.save(college);
        return "college added";
    }

    public List<College> getColleges(){
      return repository.findAll() ;

    }

    public String updateName(long id, String newName){
        College college = repository.getById(id);
        college.setName(newName);
        repository.save(college);
        return "name updated successfully";
    }

    public String updateCity(long id, String cityName){
        College college1= repository.getById(id);
        college1.setCity(cityName);
        repository.save(college1);
        return "city updated successfully";
    }

    public String deleteCollege(long id){
        repository.deleteById(id);
        return  "college removed successfully";
    }
}
