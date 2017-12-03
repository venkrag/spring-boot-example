package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by jzl639 on 12/2/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Welcome to the Spring Boot Session";
    }
}
