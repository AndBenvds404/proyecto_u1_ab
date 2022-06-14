package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Service
@Qualifier("Ahorros")	
public class CuentaBancariaAhorrosServiceImpl implements ICuentaBancariaService{


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
		//BigDecimal saldo = cta.getSaldo(); //para ejemplo hacemos un calculo diferente de interes
		BigDecimal interes = new BigDecimal(560).multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		interes = interes.add(saldo.divide(new BigDecimal(100)));
		
		return interes;
	}

	
}
