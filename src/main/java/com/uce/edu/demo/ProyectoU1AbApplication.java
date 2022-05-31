package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1AbApplication implements CommandLineRunner{
	
	//Inyeccion(ID) por metodo set
	@Autowired
	private CitaMedica2 cita;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		System.out.println("Mi primer proyecto con Spring Framework");
		
		String mostrar = cita.agentar(LocalDateTime.now(), "Andres", "Benavides", 23, "Quito", "Ramon", 12);
		
		System.out.println(mostrar);
		
	}

}
