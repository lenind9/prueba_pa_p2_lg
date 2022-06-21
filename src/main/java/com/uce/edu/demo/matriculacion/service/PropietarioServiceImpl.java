package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Override
	public void insertarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepository.crear(p);
	}

	@Override
	public Propietario buscarPropietario(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscar(cedula);
	}

	@Override
	public void actualizarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(p);
	}

	@Override
	public void borrarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(cedula);
	}

}
