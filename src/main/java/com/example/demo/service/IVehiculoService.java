package com.example.demo.service;


import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {

	public void crear(Vehiculo vehiculo);
	
	public void actualizar(Vehiculo vehiculo);

	public void eliminar(String placa);

	public Vehiculo buscar(String placa);
}
