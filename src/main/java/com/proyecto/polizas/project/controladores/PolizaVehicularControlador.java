package com.proyecto.polizas.project.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.CrossOrigin;
=======
>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
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
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @PostMapping
    public PolizaVehicular crearPolizaVehicular(@RequestBody PolizaVehicular polizaVehicular) {
        return polizaService.guardarPolizaVehicular(polizaVehicular);
    }
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @GetMapping
    public List<PolizaVehicular> obtenerTodasPolizasVehicular() {
        return polizaService.obtenerTodasPolizasVehicular();
    }
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @GetMapping("/{id}")
    public Optional<PolizaVehicular> obtenerPolizaVehicularPorId(@PathVariable Long id) {
        return polizaService.obtenerPolizaVehicularPorId(id);
    }
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @PutMapping("/{id}")
    public PolizaVehicular actualizarPolizaVehicular(@PathVariable Long id, @RequestBody PolizaVehicular polizaVehicularActualizada) {
        return polizaService.actualizarPolizaVehicular(id, polizaVehicularActualizada);
    }
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @DeleteMapping("/{id}")
    public void eliminarPolizaVehicular(@PathVariable Long id) {
        polizaService.eliminarPolizaVehicular(id);
    }
}
