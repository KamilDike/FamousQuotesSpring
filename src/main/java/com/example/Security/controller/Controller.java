package com.example.Security.controller;

import com.example.Security.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/hi")
    public ResponseEntity<String> hi() {
        return new ResponseEntity<>(service.hi(), HttpStatus.OK);
    }

    @GetMapping("/hi2")
    public ResponseEntity<String> hi2() {
        return new ResponseEntity<>(service.hi(), HttpStatus.OK);
    }
}
