package com.uce.edu.demo.parqueadero;

import org.springframework.stereotype.Component;

@Component
public class Lugar {
	
	private String codigoLugar;
	private double precio;
	
	//SET AND GET
	public String getCodigoLugar() {	
		return codigoLugar;
	}
	public void setCodigoLugar(String codigoLugar) {
		this.codigoLugar = codigoLugar;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
