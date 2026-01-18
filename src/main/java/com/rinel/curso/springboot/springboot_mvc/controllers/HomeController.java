package com.rinel.curso.springboot.springboot_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/redirect")
public class HomeController {

    @GetMapping({"", "/","/home"})
    public String redirect() {
        return "redirect:/usuario/details";
    }
    
    
}
