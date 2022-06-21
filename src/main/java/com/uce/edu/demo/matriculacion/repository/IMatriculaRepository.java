package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

public interface IMatriculaRepository {
	public void crear(Matricula m);
	public Matricula buscar(String numero);
	public void actualizar(Matricula m);
	public void eliminar(String numero);
}
