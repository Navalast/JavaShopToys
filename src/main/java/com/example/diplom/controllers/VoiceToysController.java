package com.example.diplom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VoiceToysController {
    @GetMapping("/voiceToys")
    public String voiceToys(Model model) {
        return "voiceToys";
    }
}
