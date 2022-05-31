package com.uce.edu.demo.parqueadero;

import org.springframework.stereotype.Component;

@Component
public class Auto {
	
	private String placa;
	private String marca;
	
	//SET AND GET
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
