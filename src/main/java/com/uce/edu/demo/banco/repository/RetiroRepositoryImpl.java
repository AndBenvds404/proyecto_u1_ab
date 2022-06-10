package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("se creo el retiro:"+ r);		
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo en la base el retiro: "+r);
	}

	@Override
	public Retiro buscar(String numRetiro) {
		// TODO Auto-generated method stub
		System.out.println("Se encontro ne la base el retiro: "+ numRetiro);
		Retiro r = new Retiro();
		r.setNumRetiro(numRetiro);
		return r;
	}

	@Override
	public void eliminar(String numRetiro) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino de la base el retiro: "+ numRetiro);
	
	}
	

}
