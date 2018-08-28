package com.rahulmargam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloViewController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showHelloView(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "/HelloView";
    }

}
