package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	
	public void insertarDeposito (Deposito d);
	public void actualizar (Deposito c);
	public Deposito buscar(String numDeposito);
	public void eliminar(String numDeposito);
	

}
