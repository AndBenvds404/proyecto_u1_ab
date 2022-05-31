package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

//agregar una metadata
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica2 {
	
	//inyeccion(DI)  por metodos SET
	private Doctor doctor; // 3) colocamos @Autowired al metdo set
	private Paciente paciente; //3)colocamos @Autowired al metdo set
	private LocalDateTime fecha;
	
	
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
		return "Cita agendada 2";
	}

	//SET AND GET
	public Doctor getDoctor() {
		return doctor;
	}

	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Paciente getPaciente() {
		return paciente;
	}

	@Autowired
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
