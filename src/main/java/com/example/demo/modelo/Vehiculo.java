package com.example.demo.modelo;

import java.math.BigDecimal;

public class Vehiculo {
	private String marca;
	private String placa;
	private tipo tipoVehiculo;
	private BigDecimal precio;
	
	public enum tipo {pesado, liviano};

	
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", placa=" + placa + ", tipoVehiculo=" + tipoVehiculo + ", precio=" + precio
				+ "]";
	}
	//GET y SET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}



	public tipo getTipoVehiculo() {
		return tipoVehiculo;
	}



	public void setTipoVehiculo(tipo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
	
	
	

}
