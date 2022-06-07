package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado en la base la materia: "+ m);

	}

	@Override
	public Materia buscar(String nombre) {
		System.out.println("se ha encontrado en la base la materia: "+ nombre);
		Materia m = new Materia();
		m.setNombre(nombre);
		return m;
	}

	@Override
	public void actualizar(Materia m) {
		System.out.println("se ha actualizado en la base la materia: "+ m);
		
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado en la base la materia: "+ nombre);

	}
	
	

}
