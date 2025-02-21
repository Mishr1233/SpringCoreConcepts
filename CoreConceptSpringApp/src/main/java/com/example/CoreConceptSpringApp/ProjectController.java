package com.example.CoreConceptSpringApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @GetMapping("/api")
    public String hii(){
        return "Hello World";
    }

}
