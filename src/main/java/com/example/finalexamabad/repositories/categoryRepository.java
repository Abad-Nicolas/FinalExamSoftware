package com.example.finalexamabad.repositories;


import com.example.finalexamabad.entities.category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface categoryRepository extends JpaRepository <category,Long> {
}
