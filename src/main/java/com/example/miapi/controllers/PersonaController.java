package com.example.miapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.miapi.entities.Persona;
import com.example.miapi.services.PersonaServiceImpl;

@RestController 
@CrossOrigin(origins= "*") 
@RequestMapping(path= "api/v1/personas")
public class PersonaController extends  BaseControllerImpl<Persona, PersonaServiceImpl>{

}

