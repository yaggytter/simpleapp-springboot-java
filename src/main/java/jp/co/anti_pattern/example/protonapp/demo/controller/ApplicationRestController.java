package jp.co.anti_pattern.example.protonapp.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@RestController
public class ApplicationRestController {

    @GetMapping("/getRps")
    public String getRps() {
        Random random = new Random();
        int i = random.nextInt(3);
        switch (i) {
            case 0:
                return "ろっく";
            case 1:
                return "ぺーぱー";
            case 2:
                return "しざーす";
        }
        return "unknown";
    }

}
