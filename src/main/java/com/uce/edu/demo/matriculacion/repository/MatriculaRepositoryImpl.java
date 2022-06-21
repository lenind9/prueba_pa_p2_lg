package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void crear(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado en la base la matricula: " + m);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la matricula: " + numero);
		Matricula m = new Matricula();
		//m.setVehiculo(null);
		return m;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula: " + m);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la matricula: " + numero);
	}

}
