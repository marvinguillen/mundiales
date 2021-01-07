package com.mundiales.navegar.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class country {

       @RequestMapping("/country")
    public String hola(){
        return "Hola Paises";
    }
}
