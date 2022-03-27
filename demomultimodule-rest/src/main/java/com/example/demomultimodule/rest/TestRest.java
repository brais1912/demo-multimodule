package com.example.demomultimodule.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

    @RequestMapping("/test")
    public String testRest() {
        return "test Brais";
    }
}
