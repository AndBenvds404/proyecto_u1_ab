package com.uce.edu.demo.restaurante.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.restaurante.Orden;
@Repository
public class OrdenRepositoryImpl implements IOrdenRepositoryImpl {

	@Override
	public void insertar(Orden ordn) {

		System.out.println("Se inserto en la base la orden: "+ ordn);
		
	}

	@Override
	public void buscar(String numOrden) {
		// TODO Auto-generated method stub
		
	}
	
	

}
