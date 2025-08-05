package com.rinel.curso.springboot.springboot_mvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rinel.curso.springboot.springboot_mvc.model.dto.Paramdto;

@RequestMapping("/api/params")
public class RequestParamController {


    @GetMapping("/foo")
    public Paramdto foo(@RequestParam String message){
        Paramdto param = new Paramdto(message);

        return param;
    }

}
