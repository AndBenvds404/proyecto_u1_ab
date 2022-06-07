package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1AbApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMateriaService materiaService;

	@Autowired
	private IMatriculaService matriculaService;

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

		// Usar los 3 metodos restantes
	
		e.setCedula("1727099999");
		this.estudianteService.actualizarEstudiante(e);

		this.estudianteService.buscarPorApellido("Benavides");

		this.estudianteService.borrarEstudiante("0987654321");
		
		//Tarea6 Componentes de negocio, Consumindo metodos de Materia/Matricula
		
		// ------Materia
		System.out.println("\nMATERIA");
		Materia materia1 = new Materia();
		materia1.setNombre("Programacion avanzada II");
		materia1.setSemestre("sexto");
		this.materiaService.ingresarMateria(materia1);
		this.materiaService.buscarMateria("Programacion avanzada II");
		materia1.setNombre("Programacion superior 2");
		this.materiaService.actualizarMateria(materia1);
		this.materiaService.borrarMateria("Programacion avanzada II");
		
		// ------Matricula
		System.out.println("\nMatricula");
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(e);
		matricula1.setMateria(null);
		matricula1.setNumero("P002");
		this.matriculaService.ingresarMatricula(matricula1);
		this.matriculaService.buscarMatricula("P002");
		matricula1.setNumero("P003");
		this.matriculaService.actualizarMatricula(matricula1);
		this.matriculaService.borrarMatricula("P002");
		
		
		
		
	}

}
