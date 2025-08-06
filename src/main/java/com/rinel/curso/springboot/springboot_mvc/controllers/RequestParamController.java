package com.rinel.curso.springboot.springboot_mvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rinel.curso.springboot.springboot_mvc.model.dto.Paramdto;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {


    @GetMapping("/foo")
    public Paramdto foo(@RequestParam(required = false, defaultValue = "Hola mundo") String message){
        Paramdto param = new Paramdto();
        param.setMessage(message);
        return param;
    }

}
