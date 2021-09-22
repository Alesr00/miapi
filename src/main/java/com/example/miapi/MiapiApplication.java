package com.example.miapi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.miapi.entities.Autor;
import com.example.miapi.entities.Domicilio;
import com.example.miapi.entities.Libro;
import com.example.miapi.entities.Localidad;
import com.example.miapi.entities.Persona;

@SpringBootApplication
public class MiapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiapiApplication.class, args);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistencePU");
		EntityManager em =emf.createEntityManager();
		try {
			em.getTransaction().begin();
			
			Persona persona1 = Persona.builder().nombre("Pepe").apellido("Hongo").dni(111111).build();
			Domicilio dom1 = Domicilio.builder().calle("Calle1").numero(11111).build();
			Localidad loc1 = Localidad.builder().denominacion("Godoy Cruz").build();
			Autor autor1 = Autor.builder().nombre("autornombre").apellido("autorapellido").biografia("biografia").build();
			Libro libro1 = Libro.builder().titulo("librotitulo").fecha(2021).genero("librogenero").paginas(111).build();

			System.out.println(persona1);
			System.out.println(dom1);
			System.out.println(loc1);
			System.out.println(autor1);
			System.out.println(libro1);
			
			em.persist(persona1);
			em.persist(dom1);
			em.persist(loc1);
			em.persist(autor1);
			em.persist(libro1);

			
			em.flush();
			
			em.getTransaction().commit();

			
		}catch(Exception e) {
			
			em.getTransaction().rollback();
			
		}
		em.close();
		emf.close();
	}

}
