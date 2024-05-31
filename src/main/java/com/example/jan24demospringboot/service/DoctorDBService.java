package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.DoctorTable;
import com.example.jan24demospringboot.model.StudentTable;
import com.example.jan24demospringboot.repository.DoctorDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorDBService {

    @Autowired
    DoctorDBRepository repository;

    public String saveDoctor(DoctorTable doctor){
        repository.save(doctor);
        return "Doctor saved successfully";
    }

    public List<DoctorTable> getDoctors(){
        return repository.findAll();
    }

    public String updateName(long id, String newName){
        DoctorTable doctor= repository.getById(id);
        doctor.setName(newName);
        repository.save(doctor);
        return "doctor name updated to "+newName;
    }

    public String deleteDoctor(long id){
        repository.deleteById(id);
        return "doctor removed ...";
    }
}
