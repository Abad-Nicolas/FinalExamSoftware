package com.example.finalexamabad.web;

import com.example.finalexamabad.entities.items;
import com.example.finalexamabad.entities.sales;
import com.example.finalexamabad.repositories.itemRepository;
import com.example.finalexamabad.repositories.salesRepository;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@Controller
@AllArgsConstructor
public class SalesController {

    @Autowired
    private salesRepository salesRepository;
    @Autowired
    private itemRepository itemsRepository;
    @Autowired
    private itemRepository categoryRepository;

    @GetMapping(path = "/index")
    public String getSalesSummary(Model model) {

        List<sales> salesList = salesRepository.findAll();
        model.addAttribute("salesList", salesList);

        return "CategorySDalesSummary";
    }
    @GetMapping(path = "/")
    public String getSalesSummary1(Model model) {

        List<sales> salesList = salesRepository.findAll();
        model.addAttribute("salesList", salesList);

        return "CategorySDalesSummary";
    }
    @GetMapping(path = "/itemSummary")
    public String itemsummary(Model model) {
        List<items> distinctItems = itemsRepository.findAll();
        model.addAttribute("distinctItems", distinctItems);

        return "CategorySDalesSummary";
    }


}



