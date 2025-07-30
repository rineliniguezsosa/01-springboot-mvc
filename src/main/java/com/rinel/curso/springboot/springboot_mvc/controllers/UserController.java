package com.rinel.curso.springboot.springboot_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String detailString() {
        return "Detalles";
    }
    
}
