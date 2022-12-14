package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Vehiculo;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{
	
	
	private static List<Matricula>  baseDatos = new ArrayList();

	@Override
	public void crear(Matricula matricula) {
	baseDatos.add(matricula);
		
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Actualizado" + matricula);
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		baseDatos.remove(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}



}
