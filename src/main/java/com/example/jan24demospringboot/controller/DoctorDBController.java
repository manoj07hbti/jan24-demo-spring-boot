package com.example.jan24demospringboot.controller;

import com.example.jan24demospringboot.model.DoctorTable;
import com.example.jan24demospringboot.service.DoctorDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDBController {

    @Autowired
    DoctorDBService service;

    @PostMapping("/save_doctor")
    public String saveDoctor(@RequestBody DoctorTable doctor){
        return  service.saveDoctor(doctor);
    }

    @GetMapping("/get_all_doctors")
    public List<DoctorTable> getDoctors(){
        return service.getDoctors();
    }

    @PatchMapping("/update_doc_name")
    public String updateName(@RequestParam long id, @RequestParam String newName){
        return service.updateName(id, newName);
    }

    @DeleteMapping("/delete_doc")
    public String deleteDoctor(@RequestParam long id){
        return service.deleteDoctor(id);
    }

}
