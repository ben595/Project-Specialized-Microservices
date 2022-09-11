package com.hoang.Student1Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student1Controller {
    @Value("${propertyFileName}")
    private String name;

    @RequestMapping("/fileName")
    public String getPropertyValue() {
        return this.name;
    }
}
