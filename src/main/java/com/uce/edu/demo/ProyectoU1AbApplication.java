package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.parqueadero.Ticket;
import com.uce.edu.demo.parqueadero.Ticket2;
import com.uce.edu.demo.parqueadero.Ticket3;

@SpringBootApplication
public class ProyectoU1AbApplication implements CommandLineRunner{
	
	//Inyeccion(ID) por metodo set
	@Autowired
	private CitaMedica2 cita;
	@Autowired
	private Ticket ticket1;
	@Autowired
	private Ticket2 ticket2;
	@Autowired
	private Ticket3 ticket3;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//taller en clase
		System.out.println("Mi primer proyecto con Spring Framework");
		String mostrar = cita.agentar(LocalDateTime.now(), "Andres", "Benavides", 23, "Quito", "Ramon", 12);	
		System.out.println(mostrar+"\n");
		
		//tarea 5
		String imprimirTicket;
		
		System.out.println("DI por atributos usando estereotipo Component");
		imprimirTicket = ticket1.reservar("PCA123", "Chevrolet", "A2-01", 2.50, LocalDateTime.now());
		System.out.println(imprimirTicket+"\n");
		
		System.out.println("DI por constructor usando estereotipo Service");
		imprimirTicket = ticket2.reservar("PFT456", "Toyota", "B1-02", 3.20, LocalDateTime.now());
		System.out.println(imprimirTicket+"\n");
		
		System.out.println("DI por metodo set usando estereotipo Service");
		imprimirTicket = ticket3.reservar("PQR789", "Nissan", "C1-03", 3.50, LocalDateTime.now());
		System.out.println(imprimirTicket);

		
		
		
		
		
		
	}

}
