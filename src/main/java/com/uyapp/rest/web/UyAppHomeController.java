package com.uyapp.rest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UyAppHomeController {
    @GetMapping("/")
    public String home() {
        return "home.html";
    }
}
