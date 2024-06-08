package com.example.jan24demospringboot.repository;

import com.example.jan24demospringboot.model.College;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CollegeRepository extends JpaRepository<College , Long> {

    public College findByCollegeName(String collegeName);

}
