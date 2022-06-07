package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Matricula buscar(String nombre) {
		System.out.println("se ha encontrado en la base el estudiante: "+ nombre);
		Matricula m = new Matricula();
		return null;
	}

	@Override
	public void actualizar(Matricula m) {
		System.out.println("se ha actualizado en la base el estudiante: "+ m);
		
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado en la base el estudiante: "+ nombre);

	}

	
	
}
