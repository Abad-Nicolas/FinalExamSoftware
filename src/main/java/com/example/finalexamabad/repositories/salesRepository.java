package com.example.finalexamabad.repositories;

import com.example.finalexamabad.entities.sales;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface salesRepository extends JpaRepository <sales,Long> {
    List<sales> findStudentById (long kw);
}
