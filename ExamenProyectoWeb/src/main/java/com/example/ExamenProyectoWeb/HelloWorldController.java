package com.example.ExamenProyectoWeb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHelloWorld(){
        return " ++++++ HELLO WORLD ++++++";
    }
}
