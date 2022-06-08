package com.uce.edu.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariraRepository;

@Service
public class CuentaBancariaServiceImpl  implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariraRepository bancariaRepository;
	
	@Override
	public void actualizar(CuentaBancaria c) {
	this.bancariaRepository.actualizar(c);
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(numero);
	}
	
	

}
