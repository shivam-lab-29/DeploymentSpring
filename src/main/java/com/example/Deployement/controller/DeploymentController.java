package com.example.Deployement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DeploymentController {

    @GetMapping("/d1")
    public String get()
    {
        return "My First CI/CD pipeline     ";
    }

}
