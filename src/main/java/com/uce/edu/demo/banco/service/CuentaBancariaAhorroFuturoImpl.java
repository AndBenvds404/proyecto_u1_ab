package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Service
@Qualifier ("Futuro")
public class CuentaBancariaAhorroFuturoImpl implements ICuentaBancariaService{
	
	

	@Override
	public void crear(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		
		BigDecimal interes = new BigDecimal(425).multiply(new BigDecimal(12)).divide(new BigDecimal(100));
		interes = interes.add(saldo.divide(new BigDecimal(10)));
		
		return interes;
	}
	
	

}
