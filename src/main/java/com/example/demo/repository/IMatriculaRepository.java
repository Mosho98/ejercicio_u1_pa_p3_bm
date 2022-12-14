package com.example.demo.repository;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Vehiculo;

public interface IMatriculaRepository {

	public void crear(Matricula matricula);
	
	public void actualizar(Matricula matricula);

	public void eliminar(String placa);

	public Vehiculo buscar(String placa);
}
