package com.rinel.curso.springboot.springboot_mvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    // parametros en la vista
    @GetMapping("/details")
    public String detailString(Model model) {
        model.addAttribute("title", "Hola mundo spring  boot");
        model.addAttribute("name", "Rinel");
        return "Detalles";
    }
    
}
