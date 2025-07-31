package com.rinel.curso.springboot.springboot_mvc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rinel.curso.springboot.springboot_mvc.model.User;
import com.rinel.curso.springboot.springboot_mvc.model.dto.UserDTO;

@RestController
@RequestMapping("/usuario")
public class UserRestController {

    // salida en formato json
    @GetMapping("/details")
    @ResponseBody
    public UserDTO detailString(Model model) {
        UserDTO userdto = new UserDTO();

        User user = new User("rinel","iñiguez");

        userdto.setUser(user);
        userdto.setTitle("Hola mundo spring boot");
       
        return userdto;
    }

    @GetMapping("/details2-map")
    @ResponseBody
    public Map<String,Object> detailMap(Model model) {
        User user = new User("rinel","iñiguez");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "Hola mundo spring  boot");
        body.put("user", user);
        return body;
    }
    
}
