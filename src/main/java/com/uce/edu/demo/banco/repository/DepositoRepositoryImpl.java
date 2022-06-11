package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("se creo el deposito:"+ d);		
	}

	@Override
	public void actualizar(Deposito c) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo en la base el deposito: "+c);
		
	}

	@Override
	public Deposito buscar(String numDeposito) {
		// TODO Auto-generated method stub
		System.out.println("Se encontro ne la base el deposito: "+ numDeposito);
		Deposito d= new Deposito();
		d.setNumDeposito(numDeposito);
		return d;
	}

	@Override
	public void eliminar(String numDeposito) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino de la base el deposito: "+ numDeposito);
	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDeposito = new ArrayList<>();
		Deposito depo1 =  new Deposito();
		depo1.setFechaDeposito(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("2345");
		listaDeposito.add(depo1);
		
		Deposito depo2 =  new Deposito();
		depo2.setFechaDeposito(LocalDateTime.of(2021, 3, 15, 9, 53, 2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("1234");
		listaDeposito.add(depo2);
		
		
		return listaDeposito;
	}
	


}
