package com.example.Deployement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DeploymentController {

    @GetMapping("/d1")
    public String get()
    {
        return "Hello shivam My First CI/CD pipeline ";
    }
    @GetMapping("/greeting")
    public String greeting(@PathVariable String name)
    {
        return "Hello "+name;
    }

}
