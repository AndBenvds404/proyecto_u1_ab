package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void insertar(Producto p) {

		this.productoRepository.insertar(p);

	}

	@Override
	public List<Producto> buscar(LocalDateTime fechaIngresoProd) {
		// TODO Auto-generated method stub
		return this.productoRepository.buscar(fechaIngresoProd);
	}



}
