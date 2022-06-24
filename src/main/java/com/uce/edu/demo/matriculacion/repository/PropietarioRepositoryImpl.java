package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el propietario: " + p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el propietario: " + cedula);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propie = new Propietario();
		propie.setApellido("Guananaga");
		propie.setNombre("Lenin");
		propie.setCedula(cedula);
		return propie;
	}

}
