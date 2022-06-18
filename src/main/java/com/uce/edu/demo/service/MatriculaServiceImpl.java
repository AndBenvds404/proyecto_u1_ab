package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		
		
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		
		ProfesorMateria profeM = new ProfesorMateria();
		profeM.setApellido("Tapia");
		profeM.setNombre("Jose");
		return profeM;
	}
	

	@Override
	public void ingresarMatricula(Matricula m) {
		
		
		this.matriculaRepository.insertar(m);
		System.out.println("Di desde service "+ this.profesorGeneral);//hace referencia a una unica Instancia---Scope-Singleton
		System.out.println("Di desde service "+ this.profesorMateria);//hace regerencia a una nueva Instancia---Scipo-Prototype

		System.out.println("Di un metodo General: "+ this.obtenerProfesorG());
		System.out.println("Di un metodo Materia: "+ this.obtenerProfesorM());
		

	}

	@Override
	public Matricula buscarMatricula(String numero) {
		
		return this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		
		this.matriculaRepository.actualizar(m);
		
	}

	@Override
	public void borrarMatricula(String numero) {
		
		this.matriculaRepository.eliminar(numero);
		
	}
	

	

	
}
