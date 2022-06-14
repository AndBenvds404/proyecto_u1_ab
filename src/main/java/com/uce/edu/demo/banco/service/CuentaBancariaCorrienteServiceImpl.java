package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Service
@Qualifier("Corriente")
public class CuentaBancariaCorrienteServiceImpl implements ICuentaBancariaService{

	
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
		//codigo duplicado se soluciona con una fachada (GESTOR)
		//CuentaBancaria cta = this.bancariaRepository.buscar(numeroCta);
		BigDecimal interes = saldo.multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		
		
		return interes;
	}
	
	

}
