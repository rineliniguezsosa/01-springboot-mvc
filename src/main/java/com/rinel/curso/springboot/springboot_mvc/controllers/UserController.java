package com.rinel.curso.springboot.springboot_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String detailString(Model model) {
        model.addAttribute("title", "Hola mundo spring  boot");
        model.addAttribute("name", "Rinel");
        return "Detalles";
    }
    
}
