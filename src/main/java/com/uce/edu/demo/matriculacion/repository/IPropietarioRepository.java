package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {
	public Propietario consultar(String cedula);
	public void crear(Propietario p);
	public void eliminar(String cedula);
}
