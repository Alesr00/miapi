package com.example.miapi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.example.miapi.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.miapi.entities.Persona;
import com.example.miapi.repositories.PersonaRepository;

@Service 
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
	private PersonaRepository personaRepository;
	
	public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
		
		super(baseRepository);
	}

}
