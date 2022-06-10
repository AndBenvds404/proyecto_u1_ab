package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void realizarTransferencia (String ctaOrigen, String ctaDestino,
										BigDecimal monto, String numTransferencia);
	
	public void actualizarTransferencia(Transferencia t);
	
	public Transferencia buscarTransferencia(String numTransferencia);
	
	public void eliminarTransferencia(String numTransferencia);
	

}
