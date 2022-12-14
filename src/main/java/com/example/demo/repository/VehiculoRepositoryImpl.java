package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	
	private static List<Vehiculo>  baseDatos = new ArrayList();
	
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseDatos.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizar el vehiculo: "+vehiculo);
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		baseDatos.remove(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		
		return null;
		
	}

}
