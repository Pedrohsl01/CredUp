package com.credup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CredupController {

    @GetMapping("/teste")
    public String testarApi() {
        return "CredUp API a funcionar com sucesso!";
    }
}