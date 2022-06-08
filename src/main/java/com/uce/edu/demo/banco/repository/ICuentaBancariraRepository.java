package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariraRepository {

	public void actualizar (CuentaBancaria c);
	public CuentaBancaria buscar (String numero);
	
}
