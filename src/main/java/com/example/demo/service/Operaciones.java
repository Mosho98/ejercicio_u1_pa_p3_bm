package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Vehiculo;

public class Operaciones {
	
	Vehiculo v1 = new Vehiculo();
	Matricula m1 = new Matricula();

	public BigDecimal matriculaValor;	
	
	public void descuento(String tipo) {
	if (tipo.equals(v1.getTipoVehiculo().pesado)){
		BigDecimal valorDescuento=matriculaValor.multiply(new BigDecimal(15)).divide(new BigDecimal (100));
		m1.setValorMatricula(valorDescuento);
	}else {
		BigDecimal valorDescuento=matriculaValor.multiply(new BigDecimal(10)).divide(new BigDecimal (100));
		m1.setValorMatricula(valorDescuento);
	}
	
	}
}
