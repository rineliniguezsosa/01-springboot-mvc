package com.rinel.curso.springboot.springboot_mvc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    // parametros en la vista
    @GetMapping("/details2")
    public String detailString(Model model) {
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Hola mundo spring  boot");
        body.put("name", "Rinel");
        return "Detalles";
    }
    
}
