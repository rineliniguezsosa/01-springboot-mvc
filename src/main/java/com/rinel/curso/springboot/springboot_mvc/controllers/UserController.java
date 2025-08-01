package com.rinel.curso.springboot.springboot_mvc.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.rinel.curso.springboot.springboot_mvc.model.User;


@Controller
public class UserController {

    // parametros en la vista
    @GetMapping("/details")
    public String detailString(Model model) {
        model.addAttribute("title", "Hola mundo spring  boot");
        model.addAttribute("name", "Rinel");
        return "Detalles";
    }
    

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("rinel", "sosa", "rineliniguezsosa@gmail.com"),
            new User("merly", "sosa", "merlysosa@gmail.com")
        );
        model.addAttribute("title","Spring boot course");
        model.addAttribute("users",users);
        return "templates2";
    }
    
}
