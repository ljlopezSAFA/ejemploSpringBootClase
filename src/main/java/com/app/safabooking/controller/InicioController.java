package com.app.safabooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {

    @RequestMapping("/")
    public String cargarInicio(){
        return "inicio";

    }
}
