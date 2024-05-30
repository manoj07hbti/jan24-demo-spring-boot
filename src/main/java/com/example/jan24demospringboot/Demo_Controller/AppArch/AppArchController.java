package com.example.jan24demospringboot.Demo_Controller.AppArch;

import com.example.jan24demospringboot.Repository.AppArch_Repository;
import com.example.jan24demospringboot.Service.AppArch_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppArchController {

    @Autowired
    AppArch_Service obj;

    @RequestMapping("/app")
    public String hello(){

        return obj.hello();
    }
}
