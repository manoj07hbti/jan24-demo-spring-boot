package com.example.jan24demospringboot.controller;


import com.example.jan24demospringboot.model.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Doctor_Crud_Assignment {

    ArrayList<Doctor> doctorArrayList = new ArrayList<>();

    @RequestMapping("/add_doctor")
    public String addDoctor(@RequestBody Doctor doctor){
       // Doctor doctor = new Doctor(name, age, salary);
        doctorArrayList.add(doctor);
        return "Doctor added ..";
    }
    @RequestMapping("/get_doctors")
    public ArrayList<Doctor> getDoctor(){
        return doctorArrayList;
    }

    @RequestMapping("/update_doctor_name/{newName}/{index}")
    public String updateDoctorName(@PathVariable String newName, @PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setName(newName);
        return newName +" updated successfully";
    }

    @RequestMapping("/update_doctor_age/{age}/{index}")
    public String updateDoctorAge(@PathVariable int age, @PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setAge(age);
        return " age updated ..";
    }

    @RequestMapping("/update_doctor_salary/{newSalary}/{index}")
    public String updateDoctorSalary(@PathVariable float newSalary, @PathVariable int index){
        Doctor doctor = doctorArrayList.get(index);
        doctor.setSalary(newSalary);
        return " salary updated successfully";
    }

    @RequestMapping("/delete_doctor/{index}")
    public String removeDoctor(@PathVariable int index){
        doctorArrayList.remove(index);
        return "doctor removed successfully";
    }



}
