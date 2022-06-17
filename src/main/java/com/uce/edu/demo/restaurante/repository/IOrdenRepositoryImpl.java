package com.uce.edu.demo.restaurante.repository;

import com.uce.edu.demo.restaurante.Orden;

public interface IOrdenRepositoryImpl {
	
	public void insertar (Orden ordn);
	
	public void buscar (String numOrden);

}
