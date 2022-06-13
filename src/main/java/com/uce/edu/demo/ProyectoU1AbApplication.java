package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.service.IInventarioService;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication
public class ProyectoU1AbApplication implements CommandLineRunner {


	
	@Autowired
	private IInventarioService inventarioService;
	@Autowired
	private IProductoService productoService;
	@Autowired
	private IGestorInventarioService gestorInventarioService;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

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
		
	
		this.productoService.insertar(p);
		this.productoService.insertar(p1);
		this.productoService.insertar(p2);
		this.productoService.insertar(p3);
		this.productoService.insertar(p4);
	
	
		List<Producto> listaProductos =  new ArrayList<>();
		listaProductos.add(p);
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
		
		Inventario inv = new Inventario();
		inv.setProducto(listaProductos);
		
		this.inventarioService.insertar(inv);

		this.gestorInventarioService.reporteInv(LocalDateTime.of(2022, 06, 12, 9, 00));
		
		
		
		
		
	}

}
