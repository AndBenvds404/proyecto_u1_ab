package com.uce.edu.demo.bodega;

import java.util.List;

public class Inventario {
	

	private List<Producto> producto;

	@Override
	public String toString() {
		return "Inventario [producto=" + producto + "]";
	}
	
	//SET AND GET
	
	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	
	

}
