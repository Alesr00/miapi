package com.example.miapi.controllers;

import com.example.miapi.entities.Autor;
import com.example.miapi.entities.Localidad;
import com.example.miapi.services.AutorServiceImpl;
import com.example.miapi.services.LocalidadServiceImpl;
import com.example.miapi.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "appi/v1/localidades")

public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
