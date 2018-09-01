package com.rahulmargam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class HelloJsonController {

    @RequestMapping(path = "/helloJson", method = RequestMethod.GET)
    @ResponseBody
    public Map getJson() {
        HashMap messege = new HashMap<String, String>();
        messege.put("messege", "Hi in Json");
        return messege;
    }
}
