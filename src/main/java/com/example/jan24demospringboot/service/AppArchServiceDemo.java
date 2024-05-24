package com.example.jan24demospringboot.service;


import com.example.jan24demospringboot.repository.AppArchRepositoryDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppArchServiceDemo {

    @Autowired
    AppArchRepositoryDemo repositoryDemo;

    public String hello_world(){

        // AppArchServiceDemo obj = new AppArchServiceDemo();

        return repositoryDemo.hello_world();


    }



}
