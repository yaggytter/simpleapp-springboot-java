package jp.co.anti_pattern.example.protonapp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/app/")
    public String getAllApplications() {
        return "app";
    }

}
