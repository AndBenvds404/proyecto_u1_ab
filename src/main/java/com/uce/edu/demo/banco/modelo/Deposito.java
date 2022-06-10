package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Deposito {
	private LocalDateTime fechaDeposito;
	private String numeroCuentaDestino;
	private BigDecimal monto;
	private String numDeposito;

	@Override
	public String toString() {
		return "Deposito [fechaDeposito=" + fechaDeposito + ", numeroCuentaDestino=" + numeroCuentaDestino + ", monto="
				+ monto + ", numDeposito=" + numDeposito + "]";
	}

	// SET AND GET
	public LocalDateTime getFechaDeposito() {
		return fechaDeposito;
	}

	public String getNumDeposito() {
		return numDeposito;
	}

	public void setNumDeposito(String numDeposito) {
		this.numDeposito = numDeposito;
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
