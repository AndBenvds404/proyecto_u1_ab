package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariraRepository {

	@Override
	public void actualizar(CuentaBancaria c) {
		//Aqui se contruyen los SQL's
		System.out.println("cuenta bancaria actualizada: "+ c);
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		System.out.println("se busca la cuenta bancaria: "+ numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		return cta;
	}
	
	

}
