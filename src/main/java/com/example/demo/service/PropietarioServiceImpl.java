package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	
	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.crear(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.actualizar(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		this.eliminar(cedula);
	}

	@Override
	public Vehiculo buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.buscar(cedula);
	}

	

}
