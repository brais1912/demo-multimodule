package com.example.demomultimodule.service.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaRest {

    @RequestMapping("/hola")
    public String HolaRest() {
        return "hola";
    }
}
