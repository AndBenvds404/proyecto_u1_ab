package com.uce.edu.demo.restaurante;

import java.time.LocalDate;

public class Orden {
	
	private String numOrden;
	private LocalDate fechaCreacion;
	

	
	@Override
	public String toString() {
		return "Orden [numOrden=" + numOrden + ", fechaCreacion=" + fechaCreacion + "]";
	}
	//SET AND GET
	public String getNumOrden() {
		return numOrden;
	}
	public void setNumOrden(String numOrden) {
		this.numOrden = numOrden;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	

	
	
	

}
