package com.example.diplom.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/products")
    public String products1(Model model) {
        return "products";
    }
    @GetMapping("/products2")
    public String products2(Model model) {
        return "products2";
    }
    @GetMapping("/products3")
    public String products3(Model model) {
        return "products3";
    }

}
