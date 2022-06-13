package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;
@Service
public class InventarioServiceImpl implements IInventarioService{
	

	@Autowired
	private IInventarioRepository inventarioRepository;

		@Override
	public void insertar(Inventario inventario) {
	
		this.inventarioRepository.insertar(inventario);
		
	}

		@Override
		public List<Producto> buscar(LocalDateTime fechaIngresoInv) {
			// TODO Auto-generated method stub
			return null;
		}
		
		



}
