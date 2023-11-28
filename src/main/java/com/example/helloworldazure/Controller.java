package com.example.helloworldazure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/born")
    public String hello() {
        return "Hello World - Azure!";
    }
}
