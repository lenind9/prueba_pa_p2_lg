package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IMatriculaGestorService;
import com.uce.edu.demo.matriculacion.service.IPropietarioService;
import com.uce.edu.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2LgApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IMatriculaGestorService matriculaGestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//1
		Propietario p = new Propietario();
		p.setApellido("Guananga");
		p.setNombre("Lenin");
		p.setCedula("1750418084");
		this.propietarioService.insertarPropietario(p);
		
		//2
		Vehiculo v = new Vehiculo();
		v.setMarca("Toyota");
		v.setModelo("Raize");
		v.setPlaca("PQR-4501");
		v.setPrecio(new BigDecimal(45000));
		v.setTipo("P");
		this.vehiculoService.insertarVehiculo(v);
		
		//3
		v.setPrecio(new BigDecimal(42000));
		this.vehiculoService.actualizarVehiculo(v);
		
		//4
		this.matriculaGestorService.generar("1750418084", "PQR-4501");
		
		
		
	}

}
