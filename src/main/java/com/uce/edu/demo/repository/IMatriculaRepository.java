package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
	//CRUD
	
			//C: Crear/Insertar
			public void insertar (Matricula m);
		
			//R: Leer/Buscar
			public Matricula buscar (String nombre);
			
			//U: Actualizar
			public void actualizar (Matricula m);
			
			//D: Eliminar
			public void eliminar (String nombre);

}
