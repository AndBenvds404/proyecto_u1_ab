package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
@Service
public class RetiroServiceImpl  implements IRetiroService{
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository RetiroRepository;
	
	@Override
	public void realizarRetiro(String numeroCta, BigDecimal monto, String numRetiro){
	CuentaBancaria cta = this.bancariaService.buscar(numeroCta); 
	BigDecimal saldoCtaDestino = cta.getSaldo();
	BigDecimal saldoFinal = saldoCtaDestino.subtract(monto);
	cta.setSaldo(saldoFinal);
	//luego actializamos
	this.bancariaService.actualizar(cta);
	
	Retiro retiro = new Retiro();
	retiro.setFechaRetiro(LocalDateTime.now());
	retiro.setNumeroCuenta(numeroCta);
	retiro.setMonto(monto);
	retiro.setNumRetiro(numRetiro);
	this.RetiroRepository.insertarRetiro(retiro);
	
	}

	@Override
	public void actualizarRetiro(Retiro r ) {
		// TODO Auto-generated method stub
		this.RetiroRepository.actualizar(r);;
	}

	@Override
	public Retiro buscarRetiro(String numRetiro) {
		// TODO Auto-generated method stub
		return this.RetiroRepository.buscar(numRetiro);
	}

	@Override
	public void eliminarRetiro(String numRetiro) {
		// TODO Auto-generated method stub
		this.RetiroRepository.eliminar(numRetiro);
		
	}

}
