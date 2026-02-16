package com.DEMO.CI_CD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloCiCd() {
        return "Hello From CI/CD Demo";
    }
}
