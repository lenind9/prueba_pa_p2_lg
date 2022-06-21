package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Override
	public void insertarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.crear(m);
	}

	@Override
	public Matricula buscarMatricula(String placa) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(placa);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(m);
	}

	@Override
	public void borrarMatricula(String placa) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(placa);
	}

}
