package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.restaurante.Orden;
import com.uce.edu.demo.restaurante.PlatilloDelDia;
import com.uce.edu.demo.restaurante.PlatillosCarta;
import com.uce.edu.demo.restaurante.serice.IOrdenService;

@SpringBootApplication
public class ProyectoU1AbApplication implements CommandLineRunner {


	@Autowired
	private PlatilloDelDia platoDelDia;
	@Autowired
	private PlatilloDelDia platoDelDia1;
	@Autowired
	private PlatillosCarta platoCarta;
	@Autowired
	private PlatillosCarta platoCarta1;
	@Autowired
	private IOrdenService ordenService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	
        this.platoDelDia.setNombre("spaghetti");
        this.platoDelDia.setPorcion("200 gr");
        this.platoDelDia.setPrecio(new BigDecimal(3.5));
        System.out.println(this.platoDelDia);
        System.out.println(this.platoDelDia1+"\n");
        
        this.platoDelDia1.setPorcion("150 gr");
        System.out.println(this.platoDelDia+"\n");
        
        System.out.println("EJEMPLO DE PROTOTIPE");
        this.platoCarta.setNombre("Churasco");
        this.platoCarta.setPorcion("150 gr");
        this.platoCarta.setPrecio(new BigDecimal(3.75));
		System.out.println(this.platoCarta);
		System.out.println(this.platoCarta1+"\n");
		
		Orden orden01 = new Orden();
		orden01.setFechaCreacion(LocalDate.now());
		orden01.setNumOrden("123A");
		this.ordenService.insertar(orden01);

		
        
	}

}
