package com.proyecto.polizas.project.servicios;

import java.util.List;

import com.proyecto.polizas.project.modelos.Poliza;

public interface IPolizaServicio {
	
	public List<Poliza> consultarTodo();
	
	public Poliza ingresarPoliza(Poliza poliza);
	
	public Poliza consultarPorId(long id);
	
	public void eliminarPoliza(long id);

}
