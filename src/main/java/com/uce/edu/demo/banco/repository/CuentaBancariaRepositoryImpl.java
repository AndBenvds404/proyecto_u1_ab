package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@Override
	public void actualizar(CuentaBancaria c) {
		//Aqui se contruyen los SQL's
		System.out.println("Cuenta bancaria actualizada: "+ c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		System.out.println("Se busca en la base la cuenta bancaria: "+ numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		cta.setTipo("F");
		return cta;
	}
	
	@Override
	public void insertar(CuentaBancaria c) {
		System.out.println("Se creo en la base la cuenta bancaria: "+ c);
		
	}
	
	@Override
	public void eliminar(String numero) {
		System.out.println("Se elimino de la base la cuenta: " +numero);
		
	}
	

}
