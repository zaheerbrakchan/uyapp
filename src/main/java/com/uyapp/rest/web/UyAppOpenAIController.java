package com.uyapp.rest.web;

import com.uyapp.service.UyAppOpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uyapp")
public class UyAppOpenAIController {

    @Autowired
    UyAppOpenAIService uyAppOpenAIService;

    @GetMapping("/query-ai")
    public String QueryAI(@RequestParam("query") String query) {
        return uyAppOpenAIService.chat(query);
    }

    @GetMapping("/test")
    public String Test() {
        return "Service is Running !!!!!!!!11";
    }
}
