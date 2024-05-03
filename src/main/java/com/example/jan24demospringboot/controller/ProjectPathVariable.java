package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.ArrayList;

@RestController
public class ProjectPathVariable {
    //@RequestMapping("endpoint_name/{pathVariable_name}")
    //(@PathVariable DataType varName)

    @RequestMapping("/path_hello/{name}")
    public String Hello(@PathVariable String name) {

        return "Welcome to Spring Boot Path Variable-- " + name;
    }


    // using controller--------
    @RequestMapping("/employee")
    public Employee getEmployee() {

        Employee employee = new Employee("Ajeet", 4745, "Account");



        return employee;
    }




    @RequestMapping("/employee/{name}/{empId}/{dept}")

    public Employee getEmployee(@PathVariable String name,@PathVariable int empId, @PathVariable String dept){

        Employee employee=new Employee(name,empId,dept);



        return employee;
    }





    @RequestMapping("/voting/{age}/{city}")
    public String vote(@PathVariable int age,@PathVariable String city){

    if (age>=18 && city.equalsIgnoreCase("AGRA")){


        return "You are eligible for vote in AGRA";
    }else{
        return "You are not eligible for vote in AGRA--";
    }
    }




      @RequestMapping("/brand_name")
      public ArrayList<String > brands(){
            ArrayList<String > brand = new ArrayList<>();
                      brand.add("HONDA");
                      brand.add("HERO");
                      brand.add("BMW");
                      brand.add("YAMAHA");
                      brand.add("FORD");
                      brand.add("FERRARI");
                      brand.add("AUDI");
                      brand.add("KIA");


                 for (String name : brand){
                      System.out.println(name);
                  }return brand;


      }






    @RequestMapping("/evOdd_pathVar/{nmb}")
    public String evenOdd(@PathVariable int nmb){
    if (nmb%2==0){
        return nmb+"---No is EVEN";
    }else {
        return nmb+"---NO is ODD";
    }
    }





    @RequestMapping("/prime_pathVar/{nmb}")
    public String prime(@PathVariable int nmb) {
        int count = 0;
        for (int i = 1; i <= nmb; i++) {
            if (nmb % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return nmb + "-----This is prime Number";
        } else {
            return nmb + "-----This is not a prime Number";
        }
    }

    @RequestMapping("/Square_pathaVar/{nmb}")
    public String square(@PathVariable int nmb){
    return nmb*nmb+"--This is Square of this No "+nmb;
    }

    @RequestMapping("/cube_pathVar/{nmb}")
    public  String cube(@PathVariable int nmb){
        return nmb*nmb*nmb +"---This is cube of This Number " + nmb  ;
    }



    @RequestMapping("/add_pathVar/{nmb1}/{nmb2}")
    public String add(@PathVariable int nmb1, @PathVariable int nmb2){
        return  nmb1+nmb2 + "---This is addition of given number" ;
    }

    @RequestMapping("/sub_pathVar/{nmb1}/{nmb2}")
    public String sub(@PathVariable int nmb1, @PathVariable int nmb2){

        return  nmb1-nmb2 + "---This is subtraction of given number" ;
    }

    @RequestMapping("/multi_pathVar/{nmb1}/{nmb2}")
    public String multi(@PathVariable int nmb1, @PathVariable int nmb2){

        return  nmb1*nmb2 + "---This is Multiplication of given number" ;
    }

    @RequestMapping("/divide_pathVar/{nmb1}/{nmb2}")
    public String div(@PathVariable int nmb1, @PathVariable int nmb2){

        return  (double)nmb1/nmb2 + "---This is division of given number" ;
    }


}


