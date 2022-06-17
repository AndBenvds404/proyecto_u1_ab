package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
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
	

	@Override
	public void ingresarMatricula(Matricula m) {
		
		
		this.matriculaRepository.insertar(m);
		System.out.println("Di desde service "+ this.profesorGeneral);//hace referencia a una unica Instancia---Scope-Singleton
		System.out.println("Di desde service "+ this.profesorMateria);//hace regerencia a una nueva Instancia---Scipo-Prototype

		
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
