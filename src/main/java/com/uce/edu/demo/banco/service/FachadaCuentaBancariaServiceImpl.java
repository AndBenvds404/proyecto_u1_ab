package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;
@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria{

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Autowired
	@Qualifier("Corriente")
	private ICuentaBancariaService bancariaServiceCorriente;
	
	@Autowired
	@Qualifier("Ahorros")
	private ICuentaBancariaService bancariaServiceAhorros;
	
	
	@Override
	public BigDecimal calcularInteres(String numeroCta) {
	
		BigDecimal interes= null;
		CuentaBancaria cta = this.bancariaRepository.buscar(numeroCta);
		if(cta.getTipo().equals("s")) {
			//Ahorros
			interes =this.bancariaServiceAhorros.calcularInteres(numeroCta, cta.getSaldo());
			
		}else {
			//Corriente
			interes =this.bancariaServiceCorriente.calcularInteres(numeroCta, cta.getSaldo());
			
		}
		
		return interes;
	}
}
