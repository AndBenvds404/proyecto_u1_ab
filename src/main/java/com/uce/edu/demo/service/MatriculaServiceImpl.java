package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Override
	public void ingresarMatricula(Matricula m) {
		
		this.matriculaRepository.insertar(m);
		
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
