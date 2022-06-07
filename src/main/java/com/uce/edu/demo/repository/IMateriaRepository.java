package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {
	
	//CRUD
	
			//C: Crear/Insertar
			public void insertar (Materia m);
		
			//R: Leer/Buscar
			public Materia buscar (String nombre);
			
			//U: Actualizar
			public void actualizar (Materia m);
			
			//D: Eliminar
			public void eliminar (String nombre);

}
