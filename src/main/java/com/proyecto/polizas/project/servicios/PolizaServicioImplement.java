package com.proyecto.polizas.project.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.polizas.project.modelos.Poliza;
import com.proyecto.polizas.project.repositorios.PolizaRepositorio;


@Service
public class PolizaServicioImplement implements IPolizaServicio {

	@Autowired
	PolizaRepositorio polizaRepositorio;
	
	@Override
	public List<Poliza> consultarTodo() {

		return polizaRepositorio.findAll();
	}

	@Override
	public Poliza ingresarPoliza(Poliza poliza) {

		return polizaRepositorio.save(poliza);
	}

	@Override
	public Poliza consultarPorId(long id) {

		return polizaRepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminarPoliza(long id) {

		polizaRepositorio.deleteById(id);
		
	}

	
}
