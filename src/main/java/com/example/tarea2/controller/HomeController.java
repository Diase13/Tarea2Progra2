package com.example.tarea2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.*;

@RestController
@RequestMapping(value ="api/example", produces = "application/json")
public class HomeController {
    
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saludo(@RequestParam String nombre){
        return new ResponseEntity<String>(
            "Saludo " + nombre, HttpStatus.OK);
    }
}
