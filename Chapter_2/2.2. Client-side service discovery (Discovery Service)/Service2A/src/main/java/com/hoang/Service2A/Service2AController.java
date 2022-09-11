package com.hoang.Service2A;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2AController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "This is the Service2A home page.";
    }

}
