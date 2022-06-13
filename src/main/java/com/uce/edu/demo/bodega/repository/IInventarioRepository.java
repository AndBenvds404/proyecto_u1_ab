package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.Inventario;

public interface IInventarioRepository {
	
	public void insertar(Inventario inventario);
	
	public List<Inventario> buscar (LocalDateTime fechaIngresoInv);
	


}
