package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired 
	IVehiculoRepository vehiculoRepository;

	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.actualizar(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.eliminar(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.buscar(placa);
	}

	

}
