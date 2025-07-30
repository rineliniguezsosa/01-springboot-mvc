package com.rinel.curso.springboot.springboot_mvc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UserRestController {

    // salida en formato json
    @GetMapping("/details2")
    @ResponseBody
    public Map<String,Object> detailString(Model model) {
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Hola mundo spring  boot");
        body.put("name", "Rinel");
        return body;
    }
    
}
