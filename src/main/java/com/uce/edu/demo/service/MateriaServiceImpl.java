package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {
	
	@Autowired
	private IMateriaRepository estuRepository;

	@Override
	public void ingresarMateria(Materia m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Materia buscarMateria(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarMateria(String nombre) {
		// TODO Auto-generated method stub
		
	}

}
