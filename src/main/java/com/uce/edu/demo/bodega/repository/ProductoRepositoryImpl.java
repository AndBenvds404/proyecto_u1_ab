package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {
	

	@Override
	public void insertar(Producto p) {
		
		System.out.println("se inserto un producto en la base: "+p);
		
	}
	
	@Override
	public List<Producto> buscar(LocalDateTime fechaIngreso) {
		
		System.out.println("REPORTE por Fecha de busqueda "+ fechaIngreso);
		List<Producto> listProductos = new ArrayList<Producto>();
		
		Producto p = new Producto();
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		Producto p4 = new Producto();
		
		p.setCantidad("100");
		p.setNombreProducto("Leche");
		p.setPrecioCompra(new BigDecimal(0.75));
		p.setFechaIngreso(LocalDateTime.of(2022, 06, 16, 13, 25)); 
		
		p1.setCantidad("500");
		p1.setNombreProducto("Aceite");
		p1.setPrecioCompra(new BigDecimal(2));
		p1.setFechaIngreso(LocalDateTime.of(2022, 06, 14, 20, 50)); 
		
		p2.setCantidad("100");
		p2.setNombreProducto("Vino");
		p2.setPrecioCompra(new BigDecimal(10));
		p2.setFechaIngreso(LocalDateTime.of(2022, 06, 13, 7, 45)); 
		
		p3.setCantidad("250");
		p3.setNombreProducto("Doritos");
		p3.setPrecioCompra(new BigDecimal(0.5));
		p3.setFechaIngreso(LocalDateTime.of(2022, 06, 11, 20, 50)); 
		
		p4.setCantidad("140");
		p4.setNombreProducto("Jabon");
		p4.setPrecioCompra(new BigDecimal(3));
		p4.setFechaIngreso(LocalDateTime.of(2022, 06, 11, 7, 45)); 
		listProductos.add(p);
		listProductos.add(p1);
		listProductos.add(p2);
		listProductos.add(p3);
		listProductos.add(p4);
			
		return listProductos;
	}

	
	
}
