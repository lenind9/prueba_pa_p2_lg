package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void insertarVehiculo(Vehiculo v);
	public Vehiculo buscarVehiculo(String placa);
	public void actualizarVehiculo(Vehiculo v);
	public void borrarVehiculo(String placa);
	
}
