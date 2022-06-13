package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;

@Service
public interface IInventarioService {
	
	public void insertar(Inventario inventario);
	
	public List<Producto> buscar (LocalDateTime fechaIngresoInv);
	
	

}
