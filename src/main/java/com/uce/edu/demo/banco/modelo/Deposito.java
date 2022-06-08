package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Deposito {
	private LocalDateTime fechaDeposito;
	private String numeroCuentaDestino;
	private BigDecimal monto;
	@Override
	public String toString() {
		return "Deposito [fechaDeposito=" + fechaDeposito + ", numeroCuentaDestino=" + numeroCuentaDestino + ", monto="
				+ monto + "]";
	}
	
	//SET AND GET
	public LocalDateTime getFechaDeposito() {
		return fechaDeposito;
	}
	public void setFechaDeposito(LocalDateTime fechaDeposito) {
		this.fechaDeposito = fechaDeposito;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	
	
	
	
}
