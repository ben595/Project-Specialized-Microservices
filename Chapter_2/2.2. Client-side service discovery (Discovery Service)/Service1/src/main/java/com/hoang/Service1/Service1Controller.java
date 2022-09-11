package com.hoang.Service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service1Controller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return restTemplate.getForObject("http://Service2/home", String.class);
    }

}
