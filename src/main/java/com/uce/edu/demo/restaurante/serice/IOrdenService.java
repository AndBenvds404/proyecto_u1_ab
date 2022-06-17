package com.uce.edu.demo.restaurante.serice;

import com.uce.edu.demo.restaurante.Orden;

public interface IOrdenService {

	public void insertar (Orden ordn);
	
	public void buscar (String numOrden);
}
