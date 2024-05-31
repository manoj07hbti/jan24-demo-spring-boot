package com.example.jan24demospringboot.repository;

import com.example.jan24demospringboot.model.DoctorTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDBRepository extends JpaRepository<DoctorTable,Long> {
}
