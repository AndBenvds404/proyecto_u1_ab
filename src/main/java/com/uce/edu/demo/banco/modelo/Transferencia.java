package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {
	private String numeroCuentaOrigen;
	private String numeroCuentaDestino;
	private BigDecimal montoTransferir;
	private LocalDateTime fechaTransferencia;
	private String numeroTransferencia;
	
	
	@Override
	public String toString() {
		return "Transferencia [numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino="
				+ numeroCuentaDestino + ", montoTransferir=" + montoTransferir + ", fechaTransferencia="
				+ fechaTransferencia + ", numeroTransferencia=" + numeroTransferencia + "]";
	}
	
	
	//SET AND GET
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public String getNumeroTransferencia() {
		return numeroTransferencia;
	}
	public void setNumeroTransferencia(String numeroTransferencia) {
		this.numeroTransferencia = numeroTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMontoTransferir() {
		return montoTransferir;
	}
	public void setMontoTransferir(BigDecimal montoTransferir) {
		this.montoTransferir = montoTransferir;
	}
	
	
	

}
