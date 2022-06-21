package com.uce.edu.demo.matriculacion.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void crear(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado en la base el vehiculo: " + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el vehiculo: " + placa);
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Kia");
		vehiculo.setModelo("Picantos");
		vehiculo.setPlaca(placa);
		vehiculo.setPrecio(new BigDecimal(12000));
		vehiculo.setTipo("L");
		return vehiculo;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el vehiculo: " + v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el vehiculo: " + placa);
	}

}
