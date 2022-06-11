package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiro = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setFechaRetiro(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		reti1.setMonto(new BigDecimal(25));
		reti1.setNumeroCuenta("1239");
		
		listaRetiro.add(reti1);
		
		return listaRetiro;
	}
	

}
