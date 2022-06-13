package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {
	
	public void realizarDeposito(String numeroCtaDestino,
								BigDecimal monto,String numDeposito);
	public void actualizarDeposito (Deposito d);
	public Deposito buscarDeposito (String numDeposito);
	public void eliminarDeposito (String numDeposito);
	
	
	
	
}