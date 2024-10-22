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

import com.proyecto.polizas.project.modelos.PolizaVehicular;
import com.proyecto.polizas.project.servicios.PolizaServicio;

@RestController
@RequestMapping("poliza/vehicular")
public class PolizaVehicularControlador {

	@Autowired
    private PolizaServicio polizaService;

    @PostMapping
    public PolizaVehicular crearPolizaVehicular(@RequestBody PolizaVehicular polizaVehicular) {
        return polizaService.guardarPolizaVehicular(polizaVehicular);
    }

    @GetMapping
    public List<PolizaVehicular> obtenerTodasPolizasVehicular() {
        return polizaService.obtenerTodasPolizasVehicular();
    }

    @GetMapping("/{id}")
    public Optional<PolizaVehicular> obtenerPolizaVehicularPorId(@PathVariable Long id) {
        return polizaService.obtenerPolizaVehicularPorId(id);
    }

    @PutMapping("/{id}")
    public PolizaVehicular actualizarPolizaVehicular(@PathVariable Long id, @RequestBody PolizaVehicular polizaVehicularActualizada) {
        return polizaService.actualizarPolizaVehicular(id, polizaVehicularActualizada);
    }

    @DeleteMapping("/{id}")
    public void eliminarPolizaVehicular(@PathVariable Long id) {
        polizaService.eliminarPolizaVehicular(id);
    }
}
