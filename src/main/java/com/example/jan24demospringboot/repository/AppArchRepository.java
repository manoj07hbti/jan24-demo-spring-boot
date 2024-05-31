package com.example.jan24demospringboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppArchRepository {

    public String hello(){
        return  "hello from repository" ;
    }
}
