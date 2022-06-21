package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

public interface IMatriculaService {
	public void insertarMatricula(Matricula m);
	public Matricula buscarMatricula(String placa);
	public void actualizarMatricula(Matricula m);
	public void borrarMatricula(String placa);
	
}
