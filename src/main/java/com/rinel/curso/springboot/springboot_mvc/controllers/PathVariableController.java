package com.rinel.curso.springboot.springboot_mvc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinel.curso.springboot.springboot_mvc.model.dto.Paramdto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/path")
public class PathVariableController {

    @GetMapping("/var/{message}")
    public Paramdto var(@PathVariable String message) {
        Paramdto param = new Paramdto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/multiple/{product}/{id}")
    public Map<String, Object> multiple(@PathVariable String product,@PathVariable Long id) {
        Map<String,Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);

        return json;
    }
    
    
    
}
