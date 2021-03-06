package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

//agregar una metadata
import org.springframework.stereotype.Service;

@Service
public class CitaMedica {
	

	private Doctor doctor;
	private Paciente paciente;
	private LocalDateTime fecha;
	
	//2) inyeccion por constructor 
	public CitaMedica(Doctor doctor, Paciente paciente) {

		this.doctor = doctor;
		this.paciente = paciente;
	}
	
	public String agentar(LocalDateTime fechaCita, String nombre, 
			String apelldio, int edad, String ciudad, String nombrePaciente, int edadPaciente) {
		//se inserta la cita en la base de datos
		doctor.setNombre(nombre);
		this.doctor.setApellido(apelldio);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);
		
		this.fecha = fechaCita;
		return "Cita agendada";
	}

	//SET AND GET
	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}

	
}
