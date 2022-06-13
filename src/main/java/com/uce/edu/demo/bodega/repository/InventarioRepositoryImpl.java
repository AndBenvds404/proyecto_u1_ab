package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{
	
	@Override
	public void insertar(Inventario inv) {
		
		//List<Producto> lp = listaProducots;
		
		System.out.println("Se insertor en la base el inventario:"+ inv );
		
		
	}

	@Override
	public List<Inventario> buscar(LocalDateTime fechaIngresoInv) {
		// TODO Auto-generated method stub
		return null;
	}
	


	

	

}
