package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	
	//como la logica de CuentaBancariaService no hace nada 
	//si puedo Inyectar el CuentaBancariaRepository
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	
	private ITransferenciaRepository iTransferenciaRepository; 

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto,String numTransferencia) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);// saldoOrigen - monto
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		t.setNumeroTransferencia(numTransferencia);
		this.iTransferenciaRepository.insertar(t);
	}
	
	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		
		this.iTransferenciaRepository.actualiazr(t);
	}
	
	@Override
	public Transferencia buscarTransferencia(String numTransferencia) {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.buscar(numTransferencia);
		
	}
	
	@Override
	public void eliminarTransferencia(String numTransferencia) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.eliminar(numTransferencia);
		
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//no hay logica de negocio por ende las listas de (deposito/retiro/transferencia) accedo directo al repository
		return this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
	}

}
