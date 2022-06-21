package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;

@Service
public class FachadaVehiculoServiceImpl implements IFachadaVehiculoService {
	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoService vehiculoServiceL;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoService vehiculoServiceP;
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public BigDecimal valorMatricula(String placa) {
		// TODO Auto-generated method stub
		BigDecimal valor = null;
		Vehiculo vehiculo1 = this.vehiculoRepository.buscar(placa);
		if(vehiculo1.getTipo().equals("L")) {
			valor = this.vehiculoServiceL.calcularMatricula(placa, vehiculo1.getPrecio());
		}else {
			valor = this.vehiculoServiceP.calcularMatricula(placa, vehiculo1.getPrecio());
		}
		return valor;
	}
}
