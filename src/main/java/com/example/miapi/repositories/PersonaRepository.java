package com.example.miapi.repositories;



import org.springframework.stereotype.Repository;

import com.example.miapi.entities.Persona;

@Repository 
public interface PersonaRepository extends BaseRepository <Persona, Long> {

}
