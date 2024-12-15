package com.project.SpringEcommerce.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String helloControl(){
        return "Welcome to EBuy";
    }

}
