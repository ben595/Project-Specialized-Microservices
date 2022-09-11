package com.hoang.Service2B;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2BController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "This is the Service2B home page.";
    }

}
