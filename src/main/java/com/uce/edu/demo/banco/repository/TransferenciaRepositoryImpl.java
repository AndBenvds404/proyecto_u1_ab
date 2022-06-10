package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl  implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		System.out.println("Se crea la transferencia: "+ t);
		
	}

	@Override
	public void actualiazr(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo en la base la transferencia: " + t);
		
	}

	@Override
	public Transferencia buscar(String numTransferencia) {
		// TODO Auto-generated method stub
		System.out.println("Se encontro en la base la transferencia: "+ numTransferencia);
		Transferencia t1 = new Transferencia();
		t1.setNumeroTransferencia(numTransferencia);
		return t1;
	}

	@Override
	public void eliminar(String numTransferencia) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino en la base la transferencia: "+ numTransferencia);
		
	}
	

	
}
