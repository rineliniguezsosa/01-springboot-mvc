package com.rinel.curso.springboot.springboot_mvc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinel.curso.springboot.springboot_mvc.model.User;
import com.rinel.curso.springboot.springboot_mvc.model.dto.Paramdto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/path")
public class PathVariableController {

    @Value("${config.myname}")
    private String myname;

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

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values() {
        Map<String,Object> json = new HashMap<>();

        json.put("myname",myname);
        return json;
    }
    
    
    
    
    
}
