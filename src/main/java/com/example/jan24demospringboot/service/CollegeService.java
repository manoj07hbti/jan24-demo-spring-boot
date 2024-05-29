package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.College;
import com.example.jan24demospringboot.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CollegeService {
    @Autowired
    CollegeRepository repository;
    public String addCollege(College college1){

        repository.save(college1);

        return " College Data added to be database successfully.......";

    }




}
