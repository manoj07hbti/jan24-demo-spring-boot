package com.example.jan24demospringboot.service;

import com.example.jan24demospringboot.model.College;
import com.example.jan24demospringboot.model.EmployeeUpdate;
import com.example.jan24demospringboot.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    CollegeRepository repository;
    public String addCollege(College college1){

        repository.save(college1);

        return " College Data added to be database successfully.......";

    }

    public List<College> getAllCollege(){

        return repository.findAll();//select*from table
    }

    public String update_college_name(String new_college_name , long id){

        // find record from DB

        College college = repository.getById(id); // select*from College_Jan24_Java where id=31

        // update the College name with the help of setter method

        college.setCollege_name(new_college_name);

        // save back to the database again

        repository.save(college);

        return "college name" +new_college_name+ "updated successfully";

    }
    public String add_update(String new_add , long id){

        College college = repository.getById(id);

        college.setAdd(new_add);

        repository.save(college);

        return "add" +new_add+"updated successfully";
    }

    public String removeCollege(long id){

        repository.deleteById(id);// delete from table where id=31

        return "Data removed successfully....";

    }


}
