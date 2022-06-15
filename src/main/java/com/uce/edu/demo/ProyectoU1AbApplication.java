package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1AbApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral profesorGeneral;
	@Autowired
	private ProfesorGeneral profesorGeneral1;
	@Autowired
	private ProfesorMateria profesorMatera;
	@Autowired
	private ProfesorMateria profesorMatera1;
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		this.profesorGeneral.setApellido("Lara");
		this.profesorGeneral.setNombre("Jorge");
		System.out.println(this.profesorGeneral);
		System.out.println(this.profesorGeneral1);
		this.profesorGeneral1.setNombre("Pepito");
		System.out.println(this.profesorGeneral);
		
		System.out.println("EJEMPLO PROTOTYPE");
		this.profesorMatera.setNombre("Vegeta");
		this.profesorMatera.setApellido("Quintanchala");
		
		System.out.println(this.profesorMatera);
		System.out.println(this.profesorMatera1);
		
		Matricula matricula1 = new Matricula();
        matricula1.setEstudiante(new Estudiante());
        matricula1.setMateria(new ArrayList<Materia>());
        matricula1.setNumero("13123");
        this.matriculaService.ingresarMatricula(matricula1);
		
	}

}
