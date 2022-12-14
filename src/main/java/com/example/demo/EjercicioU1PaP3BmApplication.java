package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IVehiculoService;
import com.example.demo.service.Operaciones;

@SpringBootApplication
public class EjercicioU1PaP3BmApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3BmApplication.class, args);
		
//	@Autowired
//   public IVehiculoService vehiculoService;
int op = 1;
				
		Operaciones op1 = new Operaciones();
		System.out.println("1. Pesado");
		switch(op) {
		case 1:
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Chevrolet");
		v1.setPlaca("LBB7250");
		v1.setPrecio(new BigDecimal(1000));
		v1.setTipoVehiculo(v1.getTipoVehiculo().liviano);
		Matricula m1 = new Matricula();
		op1.descuento("liviano");
		
		break;
		}
		
		
		

		BigDecimal matriculaValor = null;	
		
		
		
	}

}
