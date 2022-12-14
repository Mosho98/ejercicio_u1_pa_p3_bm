package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepository {

	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public void eliminar(String placa);

	public Vehiculo buscar(String placa);
	
}
