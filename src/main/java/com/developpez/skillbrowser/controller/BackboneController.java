package com.developpez.skillbrowser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BackboneController {

    @RequestMapping(method = RequestMethod.GET)
    public String redirect() {
        return "app";
    }
    
    @RequestMapping(value = "/app/users", method = RequestMethod.GET)
    public String redirect1() {
        return "app";
    }

}
