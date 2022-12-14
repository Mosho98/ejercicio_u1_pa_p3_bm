package com.example.demo.service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Vehiculo;

public interface IMatriculaService {


	public void crear(Matricula matricula);
	
	public void actualizar(Matricula matricula);

	public void eliminar(String placa);

	public Vehiculo buscar(String placa);
}
