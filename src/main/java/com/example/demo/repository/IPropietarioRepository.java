package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepository {

	public void crear(Propietario propietario);
	public void eliminar(String cedula);
	public Propietario consultar(String cedula);
	public void actualizar(Propietario propietario );

}
