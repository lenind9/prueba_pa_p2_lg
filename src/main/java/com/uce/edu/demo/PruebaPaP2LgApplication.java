package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IPropietarioService;
import com.uce.edu.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2LgApplication implements CommandLineRunner {

	//@Autowired
	//private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2LgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Propietario propietario1 = new Propietario();
		Vehiculo vehiculo1 = new Vehiculo();
		Matricula matricula1 = new Matricula();
		
		propietario1.setNombre("Lenin");
		propietario1.setApellido("Guananga");
		propietario1.setCedula("1750368084");
		propietarioService.insertarPropietario(propietario1);
		vehiculo1.setMarca("Chevrolet");
		vehiculo1.setModelo("Aveo Family");
		vehiculo1.setPlaca("PWR-1642");
		vehiculo1.setPrecio(new BigDecimal(13000));
		vehiculo1.setTipo("Liviano");
		//vehiculoService.insertarVehiculo(vehiculo1);
		
		vehiculo1.setPrecio(new BigDecimal(12500));;
		//vehiculoService.actualizarVehiculo(vehiculo1);
		
		
		
	}

}
