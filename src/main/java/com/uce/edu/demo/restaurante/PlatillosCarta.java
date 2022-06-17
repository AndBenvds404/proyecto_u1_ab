package com.uce.edu.demo.restaurante;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PlatillosCarta {

	private String nombre;
	private String porcion;
	private BigDecimal precio;
	
	@Override
	public String toString() {
		return "PlatillosCarta [nombre=" + nombre + ", porcion=" + porcion + ", precio=" + precio + "]";
	}
	
	//SET AND GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPorcion() {
		return porcion;
	}
	public void setPorcion(String porcion) {
		this.porcion = porcion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
	
}
