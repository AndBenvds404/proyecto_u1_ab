package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
@Repository

public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@Override
	public void insertar(Estudiante e) {
		//aqui se realiza la insercion en la base de datos
		System.out.println("se ha insertado en la base el estudiante: "+ e);
		
	}

	@Override
	public Estudiante buscar(String apellido) {
		System.out.println("se ha encontrado en la base el estudiante: "+ apellido);
		Estudiante e = new Estudiante();
		e.setApellido(apellido);
		return e;
	}

	@Override
	public void actualizar(Estudiante e) {
		System.out.println("se ha actualizado en la base el estudiante: "+ e);
		
	}

	@Override
	public void eliminar(String cedula) {
		System.out.println("se ha eliminado en la base el estudiante: "+ cedula);
		
	}
	
	

}
