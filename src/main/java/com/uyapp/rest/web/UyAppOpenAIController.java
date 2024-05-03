package com.uyapp.rest.web;

import com.uyapp.service.UyAppOpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.Origin;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/uyapp")
//@CrossOrigin("*")
public class UyAppOpenAIController {

    @Autowired
    UyAppOpenAIService uyAppOpenAIService;


    @PostMapping("/user-query")
    public String QueryAI(@RequestBody String query) {
        return uyAppOpenAIService.chat(query);
    }



    @GetMapping("/test")
    public String Test() {
        return "Service is Running !!!!!!!!11";
    }


}
