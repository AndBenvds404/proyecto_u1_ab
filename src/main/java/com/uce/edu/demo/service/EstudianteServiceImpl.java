package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.repository.IEstudianteRepository;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository estuRepository;

	@Override
	public void ingresarEstudiante(Estudiante e) {

		this.estuRepository.insertar(e);

	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {

		return this.estuRepository.buscar(apellido);
	}

	@Override
	public void actualizarEstudiante(Estudiante e) {

		this.estuRepository.actualizar(e);

	}

	@Override
	public void borrarEstudiante(String cedula) {

		this.estuRepository.eliminar(cedula);
	}

}
