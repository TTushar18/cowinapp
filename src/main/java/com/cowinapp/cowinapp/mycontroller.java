package com.cowinapp.cowinapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
    @GetMapping("/cources")
    public String getData(){
        return "Please Use Cowin to Book Vacinee";
    }
}
