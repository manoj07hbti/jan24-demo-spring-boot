package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.repository.AppArchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppArchService {

    @Autowired
    AppArchRepository repo;


    public String hello(){
        return repo.hello();
    }
}
