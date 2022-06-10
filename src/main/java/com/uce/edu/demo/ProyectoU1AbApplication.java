package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1AbApplication implements CommandLineRunner {

	@Autowired
	private ITransferenciaService TransferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private IRetiroService retiroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//-------------Transferencia
		System.out.println("\n --Transferencia");
		this.TransferenciaService.realizarTransferencia("12", "13", new BigDecimal(30),"11111");

		//-------------Deposito
		System.out.println("\n --Deposito");
		this.depositoService.realizarDeposito("14", new BigDecimal(50),"12345");
	
	
		//-------------Retiro
		System.out.println("\n --Retiro");
		Retiro r = new Retiro();
		r.setFechaRetiro(LocalDateTime.now());
		r.setNumRetiro("10101");
		r.setMonto(new BigDecimal(50));
		r.setNumeroCuenta("17");
		this.retiroService.realizarRetiro("16", new BigDecimal(40),"54321");
		this.retiroService.actualizarRetiro(r);
		this.retiroService.buscarRetiro("11111");
		this.retiroService.eliminarRetiro("12121");


	}

}
