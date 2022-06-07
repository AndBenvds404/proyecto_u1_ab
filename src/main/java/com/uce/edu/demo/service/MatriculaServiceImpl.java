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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Matricula buscarMatricula(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		
	}
	

	

	
}
