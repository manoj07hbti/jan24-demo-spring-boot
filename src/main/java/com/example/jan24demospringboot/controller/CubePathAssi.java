package com.example.jan24demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CubePathAssi {

    /*Todo syntax: @RequestMapping("endpoint_name/{pathVariable_name"})
    @PathVariable DataType variableName)
                                   */


    @RequestMapping("/cube2/{number}")
    public String cube2(@PathVariable int number){

        int num = 8;

        return "number*number*number + is cube of given number";
    }


}
