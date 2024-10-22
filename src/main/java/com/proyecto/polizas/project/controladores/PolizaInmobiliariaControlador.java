package com.proyecto.polizas.project.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.polizas.project.modelos.PolizaInmobiliaria;
import com.proyecto.polizas.project.servicios.PolizaServicio;

@RestController
@RequestMapping("poliza/inmobiliaria")
public class PolizaInmobiliariaControlador {

	@Autowired
    private PolizaServicio polizaService;

    @PostMapping
    public PolizaInmobiliaria crearPolizaInmobiliaria(@RequestBody PolizaInmobiliaria polizaInmobiliaria) {
        return polizaService.guardarPolizaInmobiliaria(polizaInmobiliaria);
    }

    @GetMapping
    public List<PolizaInmobiliaria> obtenerTodasPolizasInmobiliaria() {
        return polizaService.obtenerTodasPolizasInmobiliaria();
    }

    @GetMapping("/{id}")
    public Optional<PolizaInmobiliaria> obtenerPolizaInmobiliariaPorId(@PathVariable Long id) {
        return polizaService.obtenerPolizaInmobiliariaPorId(id);
    }

    @PutMapping("/{id}")
    public PolizaInmobiliaria actualizarPolizaInmobiliaria(@PathVariable Long id, @RequestBody PolizaInmobiliaria polizaInmobiliariaActualizada) {
        return polizaService.actualizarPolizaInmobiliaria(id, polizaInmobiliariaActualizada);
    }

    @DeleteMapping("/{id}")
    public void eliminarPolizaInmobiliaria(@PathVariable Long id) {
        polizaService.eliminarPolizaInmobiliaria(id);
    }
}
