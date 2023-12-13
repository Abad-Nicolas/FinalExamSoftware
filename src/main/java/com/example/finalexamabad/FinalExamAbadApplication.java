package com.example.finalexamabad;

import com.example.finalexamabad.entities.category;
import com.example.finalexamabad.entities.items;


import com.example.finalexamabad.repositories.categoryRepository;
import com.example.finalexamabad.repositories.salesRepository;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import java.util.Date;

@SpringBootApplication
public class FinalExamAbadApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalExamAbadApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(salesRepository salesRepository){
        return args -> {

            salesRepository.findAll().forEach(p->{
                System.out.println(p.getRecno());
            });
        };
    }


}
