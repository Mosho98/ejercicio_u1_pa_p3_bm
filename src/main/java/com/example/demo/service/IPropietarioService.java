package com.example.demo.service;


import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

public interface IPropietarioService {

	public void crear(Propietario propietario);
	
	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);

	public Vehiculo buscar(String cedula);
}
