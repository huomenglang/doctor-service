package com.menglang.doctor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorControllers {

    @GetMapping
    public String getDoctor() {
        return "Hello Doctor";
    }
}
