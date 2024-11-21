package com.proyecto.polizas.project.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.polizas.project.modelos.PolizaMovil;
import com.proyecto.polizas.project.servicios.PolizaServicio;

@RestController
@RequestMapping("poliza/movil")
public class PolizaMovilControlador {

	@Autowired
    private PolizaServicio polizaService;

	@CrossOrigin(origins = "http://localhost:5173")
    @PostMapping
    public PolizaMovil crearPolizaMovil(@RequestBody PolizaMovil polizaMovil) {
        return polizaService.guardarPolizaMovil(polizaMovil);
    }
	@CrossOrigin(origins = "http://localhost:5173")
    @GetMapping
    public List<PolizaMovil> obtenerTodasPolizasMovil() {
        return polizaService.obtenerTodasPolizasMovil();
    }
	@CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/{id}")
    public Optional<PolizaMovil> obtenerPolizaMovilPorId(@PathVariable Long id) {
        return polizaService.obtenerPolizaMovilPorId(id);
    }
	@CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/{id}")
    public PolizaMovil actualizarPolizaMovil(@PathVariable Long id, @RequestBody PolizaMovil polizaMovilActualizada) {
        return polizaService.actualizarPolizaMovil(id, polizaMovilActualizada);
    }
	@CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/{id}")
    public void eliminarPolizaMovil(@PathVariable Long id) {
        polizaService.eliminarPolizaMovil(id);
    }
	
}
