package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.Producto;

public interface IProductoRepository {
	
	public void insertar(Producto p);
	
	public List<Producto> buscar (LocalDateTime fechaIngresoProd);
	


}
