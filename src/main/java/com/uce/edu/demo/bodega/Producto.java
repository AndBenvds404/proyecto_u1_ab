package com.uce.edu.demo.bodega;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {
	
	private String nombreProducto;
	private String cantidad;
	private BigDecimal precioCompra;
	private LocalDateTime fechaIngreso;
	
	
	
	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", precioCompra="
				+ precioCompra + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	//SET AND GET
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
	
}
