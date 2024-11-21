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

import com.proyecto.polizas.project.modelos.PolizaMovil;
import com.proyecto.polizas.project.servicios.PolizaServicio;

@RestController
@RequestMapping("poliza/movil")
public class PolizaMovilControlador {

	@Autowired
    private PolizaServicio polizaService;

<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======
>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @PostMapping
    public PolizaMovil crearPolizaMovil(@RequestBody PolizaMovil polizaMovil) {
        return polizaService.guardarPolizaMovil(polizaMovil);
    }
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @GetMapping
    public List<PolizaMovil> obtenerTodasPolizasMovil() {
        return polizaService.obtenerTodasPolizasMovil();
    }
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @GetMapping("/{id}")
    public Optional<PolizaMovil> obtenerPolizaMovilPorId(@PathVariable Long id) {
        return polizaService.obtenerPolizaMovilPorId(id);
    }
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @PutMapping("/{id}")
    public PolizaMovil actualizarPolizaMovil(@PathVariable Long id, @RequestBody PolizaMovil polizaMovilActualizada) {
        return polizaService.actualizarPolizaMovil(id, polizaMovilActualizada);
    }
<<<<<<< HEAD
	@CrossOrigin(origins = "http://localhost:5173")
=======

>>>>>>> 5135eb5747bf1de53adeb574e236a6ac769b367f
    @DeleteMapping("/{id}")
    public void eliminarPolizaMovil(@PathVariable Long id) {
        polizaService.eliminarPolizaMovil(id);
    }
	
}
