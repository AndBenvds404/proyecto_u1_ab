package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	
	public void realizarRetiro(String numeroCta,
								BigDecimal monto, String numRetiro);
	public void actualizarRetiro (Retiro d);
	public Retiro buscarRetiro (String numRetiro);
	public void eliminarRetiro (String numRetiro);
	
	
	
	
}
