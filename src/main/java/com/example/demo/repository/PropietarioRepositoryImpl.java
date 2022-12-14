package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;


@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{
	
	private static List<Propietario> baseDatos = new ArrayList(); 

	@Override
	public void crear(Propietario propietario) {
		baseDatos.add(propietario);		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		baseDatos.remove(cedula);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		
	}



	
}
