package com.example.tarea2.controller;

import java.util.Optional;

import com.example.tarea2.model.*;
import com.example.tarea2.repository.AlumnoRepository;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/alumno", produces ="application/json")
public class AlumnoController {
    
    private final AlumnoRepository alumnoData;

    public AlumnoController(AlumnoRepository alumnoData) {
        this.alumnoData = alumnoData;
    }

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> create(@RequestBody Alumno p){
        alumnoData.save(p);
        alumnoData.flush();
        return new ResponseEntity<Integer>(p.getCodigoAlumno(),HttpStatus.CREATED);
    }

    @GetMapping(value = "/{numeroAlumno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Alumno> findByNumber(@PathVariable String numeroAlumno){
        Optional<Alumno> optAlum =alumnoData.findByAlumno(numeroAlumno);
        if(optAlum.isPresent()){
            Alumno factura = optAlum.get();
            return new ResponseEntity<Alumno>(factura,HttpStatus.OK);
        }else{
            return new ResponseEntity<Alumno>(HttpStatus.NOT_FOUND);
        }

        
    }
}