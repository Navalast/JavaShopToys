package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StocksController {
    @GetMapping("/stocks")
    public String newest(Model model) {
        return "stocks";
    }
}
