package com.uce.edu.demo.banco.repository;

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
	


}
