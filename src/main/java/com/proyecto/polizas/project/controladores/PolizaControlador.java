package com.proyecto.polizas.project.controladores;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.polizas.project.modelos.Poliza;
import com.proyecto.polizas.project.servicios.PolizaServicioImplement;

@RestController
@RequestMapping("/apipoliza/v1")
public class PolizaControlador {

	@Autowired
	PolizaServicioImplement polizaServicio;

	@GetMapping("/polizas")
	public List<Poliza> obtenerPolizas(){
		return polizaServicio.consultarTodo();
	}
	
	@PostMapping("/poliza")
	public ResponseEntity<Poliza> registrarPoliza(@RequestBody Poliza poliza) {
		Poliza nueva_poliza = polizaServicio.ingresarPoliza(poliza);
		return new ResponseEntity<>(nueva_poliza, HttpStatus.CREATED);
	}
	
	@GetMapping("/poliza/{id}")
	public ResponseEntity<Poliza> obtenerClienteId(@PathVariable long id){
		Poliza poliza_buscada = polizaServicio.consultarPorId(id);
		return ResponseEntity.ok(poliza_buscada);
	}
	
	@PutMapping("/poliza/{id}")
	public ResponseEntity<Poliza> actualizarPoliza(@PathVariable long id, @RequestBody Poliza cliente){
		Poliza nueva_poliza = polizaServicio.consultarPorId(id);
		nueva_poliza.setDni_Asegurado(cliente.getDni_Asegurado());
		nueva_poliza.setNombre_Asegurado(cliente.getNombre_Asegurado());
		nueva_poliza.setTipo_Seguro(cliente.getTipo_Seguro());
		nueva_poliza.setFecha_Inicio(cliente.getFecha_Inicio());
		nueva_poliza.setFecha_Fin(cliente.getFecha_Fin());
		nueva_poliza.setMonto_Asegurado(cliente.getMonto_Asegurado());
		
		Poliza poliza_actualizado = polizaServicio.ingresarPoliza(nueva_poliza);
		return new ResponseEntity<>(poliza_actualizado, HttpStatus.CREATED);
	
	}
	
	@DeleteMapping("/poliza/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarPoliza(@PathVariable long id){
		Poliza poliza_buscada = polizaServicio.consultarPorId(id);
		
		if (poliza_buscada!=null) {
			this.polizaServicio.eliminarPoliza(id);
			HashMap<String, Boolean> estadoPolizaEliminado = new HashMap<>();
			estadoPolizaEliminado.put("eliminado", true);
			return ResponseEntity.ok(estadoPolizaEliminado);
		}else {
			HashMap<String, Boolean> estadoPolizaEliminado2 = new HashMap<>();
			estadoPolizaEliminado2.put("eliminado", false);
			return ResponseEntity.ok(estadoPolizaEliminado2);
		}
	}
	
	
	
}
