package com.gabriel.client.sociallogin.sociallogin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }

}
