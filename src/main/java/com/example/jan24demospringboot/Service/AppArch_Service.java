package com.example.jan24demospringboot.Service;

import com.example.jan24demospringboot.Repository.AppArch_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppArch_Service {

    @Autowired
    AppArch_Repository obj;
    public String hello(){

        return obj.hello();
    }
}


