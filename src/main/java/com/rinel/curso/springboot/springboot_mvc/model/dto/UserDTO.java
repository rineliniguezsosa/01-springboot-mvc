package com.rinel.curso.springboot.springboot_mvc.model.dto;

import com.rinel.curso.springboot.springboot_mvc.model.User;

public class UserDTO {

    private String title;
    private User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    

    
    
}
