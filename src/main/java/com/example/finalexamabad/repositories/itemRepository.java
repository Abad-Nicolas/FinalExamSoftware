package com.example.finalexamabad.repositories;


import com.example.finalexamabad.entities.items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface itemRepository extends JpaRepository <items,Long> {
}
