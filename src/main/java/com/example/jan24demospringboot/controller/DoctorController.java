package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.Doctor;
import com.example.jan24demospringboot.model.Employee1;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

@RestController
public class DoctorController {

    ArrayList<Doctor> doctorArrayList = new ArrayList<>();

    @RequestMapping("/add_doctor/{name}/{age}/{salary}")
    public String addDoctor(@PathVariable String name, @PathVariable int age, @PathVariable double salary){
        Doctor doctor = new Doctor(name, age, salary);
        doctorArrayList.add(doctor);
        return "Doctor added ..";
    }
    @RequestMapping("/get_doctors")
    public ArrayList<Doctor> getDoctor(){
        return doctorArrayList;
    }

    @RequestMapping("/update_doctorname/{newName}/{index}")
    public String updateDoctorName(@PathVariable String newName, @PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setName(newName);
        return newName +" updated successfully";
    }

    @RequestMapping("/update_doctorage/{age}/{index}")
    public String updateDoctorAge(@PathVariable int age, @PathVariable int index){
       Doctor doctor = doctorArrayList.get(index);
       doctor.setAge(age);
        return " age updated ..";
    }

    @RequestMapping("/update_doctorsal/{newSal}/{index}")
    public String updateDoctorSalary(@PathVariable double newSal, @PathVariable int index){
       Doctor doctor = doctorArrayList.get(index);
       doctor.setSalary(newSal);
        return " salary updated successfully";
    }

    @RequestMapping("/remove_doctor/{index}")
    public String removeDoctor(@PathVariable int index){
        doctorArrayList.remove(index);
        return "doctor removed successfully";
    }
}
