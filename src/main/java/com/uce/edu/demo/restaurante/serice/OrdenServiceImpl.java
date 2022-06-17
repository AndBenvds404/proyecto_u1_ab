package com.uce.edu.demo.restaurante.serice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.restaurante.Orden;
import com.uce.edu.demo.restaurante.PlatilloDelDia;
import com.uce.edu.demo.restaurante.PlatillosCarta;
import com.uce.edu.demo.restaurante.repository.IOrdenRepositoryImpl;
@Service
public class OrdenServiceImpl implements IOrdenService {
	
	@Autowired
	private IOrdenRepositoryImpl ordenRepositoryImpl;
	@Autowired
	private PlatilloDelDia platoDelDia;
	@Autowired
	private PlatillosCarta platoCarta;
	
	

	@Override
	public void insertar(Orden ordn) {
		this.ordenRepositoryImpl.insertar(ordn);
		System.out.println("Di desde service: "+this.platoDelDia);
		System.out.println("Di desde service: "+this.platoCarta);
		
		
	}

	@Override
	public void buscar(String numOrden) {
		// TODO Auto-generated method stub
		
	}
	
	

}
