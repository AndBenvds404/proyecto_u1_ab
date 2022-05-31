package com.uce.edu.demo.parqueadero;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticket3 {

	private Auto auto;
	private Lugar lugar;

	private LocalDateTime fechaIngreso;

	public String reservar(String placa, String marca, String codigo, double precio, LocalDateTime fechaIngreso) {

		this.auto.setPlaca(placa);
		this.auto.setMarca(marca);

		this.lugar.setCodigoLugar(codigo);
		this.lugar.setPrecio(precio);

		this.fechaIngreso = fechaIngreso;

		return "Lugar asignado";
	}

	public Auto getAuto() {
		return auto;
	}

	@Autowired
	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Lugar getLugar() {
		return lugar;
	}

	@Autowired
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
