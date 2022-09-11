package com.hoang.StudentService.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Value("${my_greeting}")
    private String greeting;

    @RequestMapping(value = "/home/{name}", method = RequestMethod.GET)
    public String home(@PathVariable("name") String name) {
        return "<h1>" + greeting + " " + name + "</h1>";
    }
}
