package com.example.jan24demospringboot.CrudOperation;

import com.example.jan24demospringboot.Models.Doctor_Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

public class Doctor {
    ArrayList<Doctor_Model>Doctors=new ArrayList<>();
    @RequestMapping("/AddDoctors/{name}/{age}/{salary}")
    public String AddDoctors(@PathVariable String name,@PathVariable int age,@PathVariable int salary){
        Doctor_Model doctorModel=new Doctor_Model(name,age,salary);
        Doctors.add(doctorModel);
        return "one Doctor Details Added Successfully....";
    }
@RequestMapping("/getDoctors")
    public ArrayList<Doctor_Model> getDoctors() {
        return Doctors;
    }
    @RequestMapping("/UpdateDoctors/{index}/{new_name}")
    public String UpdateDoctors(@PathVariable int index,@PathVariable String new_name) {
        Doctor_Model doctors= Doctors.get(index);
        doctors.setName(new_name);
        return new_name+" is updated successfully...";
    }
    @RequestMapping("/RemoveDoctor/{index}")
    public String RemoveDoctor(@PathVariable int index){
       Doctors.remove(index);
       return "one Doctor is removed successfully.....";
    }
}
