package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
@Service
public class DepositoServiceImpl  implements IDepositoService{
	
	@Autowired
	@Qualifier("Ahorros")
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto, String numDeposito){
	CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino); 
	BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
	BigDecimal saldoFinal = saldoCtaDestino.add(monto);
	ctaDestino.setSaldo(saldoFinal);
	//luego actializamos
	this.bancariaService.actualizar(ctaDestino);
	
	Deposito deposito = new Deposito();
	deposito.setFechaDeposito(LocalDateTime.now());
	deposito.setNumeroCuentaDestino(numeroCtaDestino);
	deposito.setMonto(monto);
	deposito.setNumDeposito(numDeposito);
	this.depositoRepository.insertarDeposito(deposito);
	
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		this.depositoRepository.actualizar(d);
	}

	@Override
	public Deposito buscarDeposito(String numDeposito) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscar(numDeposito);
	}

	@Override
	public void eliminarDeposito(String numDeposito) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminar(numDeposito);
		
	}

}
