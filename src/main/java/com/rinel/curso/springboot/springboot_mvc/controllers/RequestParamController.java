package com.rinel.curso.springboot.springboot_mvc.controllers;

import java.net.http.HttpRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rinel.curso.springboot.springboot_mvc.model.dto.ParamMixdto;
import com.rinel.curso.springboot.springboot_mvc.model.dto.Paramdto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {


    @GetMapping("/foo")
    public Paramdto foo(@RequestParam(required = false, defaultValue = "Hola mundo") String message){
        Paramdto param = new Paramdto();
        param.setMessage(message);
        return param;
    }

    //multiples params
    @GetMapping("/bar")
    public ParamMixdto bar(@RequestParam() String txt, @RequestParam Integer code){
        ParamMixdto param = new ParamMixdto();
        param.setMessage(txt);
        param.setCode(code);
        return param;
    }

    @GetMapping("/request")
    public ParamMixdto request(HttpServletRequest request){
        Integer code = 10;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        ParamMixdto param = new ParamMixdto();
        param.setCode(code);
        param.setMessage(request.getParameter("txt"));
        return param;
    }

}
