package com.uce.edu.demo.parqueadero;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

//DI por constructor usando estereotipo Service
@Service
public class Ticket2 {

	private Auto auto;
	private Lugar lugar;
	private LocalDateTime fechaIngreso;

	public Ticket2(Auto auto, Lugar lugar) {

		this.auto = auto;
		this.lugar = lugar;
	}

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

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Lugar getLugar() {
		return lugar;
	}

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
