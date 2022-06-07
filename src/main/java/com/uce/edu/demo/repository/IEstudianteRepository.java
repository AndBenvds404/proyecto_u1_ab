	package com.uce.edu.demo.repository;
	
	import com.uce.edu.demo.modelo.Estudiante;
	
	public interface IEstudianteRepository {
		
	//CRUD
			
		//C: Crear/Insertar
		public void insertar (Estudiante e);
	
		//R: Leer/Buscar
		public Estudiante buscar (String apellido);
		
		//U: Actualizar
		public void actualizar (Estudiante e);
		
		//D: Eliminar
		public void eliminar (String cedula);
		
	}
