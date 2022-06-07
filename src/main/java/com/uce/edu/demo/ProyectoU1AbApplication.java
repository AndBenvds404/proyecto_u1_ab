package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1AbApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AbApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e = new Estudiante();
		e.setNombre("Andres");
		e.setApellido("Benavides");
		e.setCedula("1234567890");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Mike");
		e1.setApellido("Wasoski");
		e1.setCedula("0987654321");
		this.estudianteService.ingresarEstudiante(e1);
		
		
		//Usar los 3 metodos restantes
		e.setCedula("1727099999");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Benavides");
		
		this.estudianteService.borrarEstudiante("0987654321");
		
	}

}
