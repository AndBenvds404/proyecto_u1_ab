package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.Producto;

public interface IProductoService {

	
	
	public void insertar(Producto p);
	
	public List<Producto> buscar (LocalDateTime fechaIngresoInv);
	

}
