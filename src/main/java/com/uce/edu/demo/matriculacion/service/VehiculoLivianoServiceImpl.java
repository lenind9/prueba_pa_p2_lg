package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Service
@Qualifier("liviano")
public class VehiculoLivianoServiceImpl implements IVehiculoService {

	@Override
	public void insertarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarVehiculo(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularMatricula(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valor = precio.multiply(new BigDecimal(0.14));
		if(valor.compareTo(new BigDecimal(2000)) == 1) {
			valor = valor.multiply(new BigDecimal(0.93));
		}
		return valor;
	}

}
