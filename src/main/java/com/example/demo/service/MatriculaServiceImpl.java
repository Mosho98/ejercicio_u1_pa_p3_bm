package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired 
	private IMatriculaRepository matriculaRepository;
	
	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.crear(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(placa);
	}

}
