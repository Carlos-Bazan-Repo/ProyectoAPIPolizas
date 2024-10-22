package com.proyecto.polizas.project.servicios;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.proyecto.polizas.project.modelos.PolizaInmobiliaria;
import com.proyecto.polizas.project.modelos.PolizaMovil;
import com.proyecto.polizas.project.modelos.PolizaVehicular;
import com.proyecto.polizas.project.repositorios.PolizaInmobiliariaRepository;
import com.proyecto.polizas.project.repositorios.PolizaMovilRepository;
import com.proyecto.polizas.project.repositorios.PolizaVehicularRepository;


@Service
public class PolizaServicio {

	@Autowired
    private PolizaMovilRepository polizaMovilRepository;
    @Autowired
    private PolizaVehicularRepository polizaVehicularRepository;
    @Autowired
    private PolizaInmobiliariaRepository polizaInmobiliariaRepository;
    
    public PolizaMovil guardarPolizaMovil(PolizaMovil polizaMovil) {
        return polizaMovilRepository.save(polizaMovil);
    }

    public PolizaVehicular guardarPolizaVehicular(PolizaVehicular polizaVehicular) {
        return polizaVehicularRepository.save(polizaVehicular);
    }

    public PolizaInmobiliaria guardarPolizaInmobiliaria(PolizaInmobiliaria polizaInmobiliaria) {
        return polizaInmobiliariaRepository.save(polizaInmobiliaria);
    }

    public List<PolizaMovil> obtenerTodasPolizasMovil() {
        return polizaMovilRepository.findAll();
    }

    public List<PolizaVehicular> obtenerTodasPolizasVehicular() {
        return polizaVehicularRepository.findAll();
    }

    public List<PolizaInmobiliaria> obtenerTodasPolizasInmobiliaria() {
        return polizaInmobiliariaRepository.findAll();
    }

    public Optional<PolizaMovil> obtenerPolizaMovilPorId(Long id) {
        return polizaMovilRepository.findById(id);
    }

    public Optional<PolizaVehicular> obtenerPolizaVehicularPorId(Long id) {
        return polizaVehicularRepository.findById(id);
    }

    public Optional<PolizaInmobiliaria> obtenerPolizaInmobiliariaPorId(Long id) {
        return polizaInmobiliariaRepository.findById(id);
    }

    public void eliminarPolizaMovil(Long id) {
        polizaMovilRepository.deleteById(id);
    }

    public void eliminarPolizaVehicular(Long id) {
        polizaVehicularRepository.deleteById(id);
    }

    public void eliminarPolizaInmobiliaria(Long id) {
        polizaInmobiliariaRepository.deleteById(id);
    }

    public PolizaMovil actualizarPolizaMovil(Long id, PolizaMovil polizaMovilActualizada) {
        polizaMovilActualizada.setId(id);
        return polizaMovilRepository.save(polizaMovilActualizada);
    }

    public PolizaVehicular actualizarPolizaVehicular(Long id, PolizaVehicular polizaVehicularActualizada) {
        polizaVehicularActualizada.setId(id);
        return polizaVehicularRepository.save(polizaVehicularActualizada);
    }

    public PolizaInmobiliaria actualizarPolizaInmobiliaria(Long id, PolizaInmobiliaria polizaInmobiliariaActualizada) {
        polizaInmobiliariaActualizada.setId(id);
        return polizaInmobiliariaRepository.save(polizaInmobiliariaActualizada);
    }
    
//    public Poliza guardarPoliza(Poliza poliza) {
//        if (poliza instanceof PolizaMovil) {
//            return polizaMovilRepository.save((PolizaMovil) poliza);
//        } else if (poliza instanceof PolizaVehicular) {
//            return polizaVehicularRepository.save((PolizaVehicular) poliza);
//        } else if (poliza instanceof PolizaInmobiliaria) {
//            return polizaInmobiliariaRepository.save((PolizaInmobiliaria) poliza);
//        } else {
//            throw new IllegalArgumentException("Tipo de póliza no soportado");
//        }
//    }
//    
//    public List<Poliza> obtenerTodasPolizas() {
//        List<Poliza> polizas = new ArrayList<>();
//        polizas.addAll(polizaMovilRepository.findAll());
//        polizas.addAll(polizaVehicularRepository.findAll());
//        polizas.addAll(polizaInmobiliariaRepository.findAll());
//        return polizas;
//    }
//    
//    
//    public Optional<Poliza> obtenerPolizaPorId(Long id) {
//        List<JpaRepository<? extends Poliza, Long>> repositorios = Arrays.asList(
//            polizaMovilRepository,
//            polizaVehicularRepository,
//            polizaInmobiliariaRepository
//        );
//
//        for (JpaRepository<? extends Poliza, Long> repositorio : repositorios) {
//            Optional<? extends Poliza> poliza = repositorio.findById(id);
//            if (poliza.isPresent()) {
//                return (Optional<Poliza>) poliza;
//            }
//        }
//
//        return Optional.empty();
//    }
//    
//    
//    public void eliminarPoliza(Long id) {
//        if (polizaMovilRepository.existsById(id)) {
//            polizaMovilRepository.deleteById(id);
//        } else if (polizaVehicularRepository.existsById(id)) {
//            polizaVehicularRepository.deleteById(id);
//        } else if (polizaInmobiliariaRepository.existsById(id)) {
//            polizaInmobiliariaRepository.deleteById(id);
//        } else {
//            throw new IllegalArgumentException("Póliza no encontrada");
//        }
//    }
//    
//    public Poliza actualizarPoliza(Long id, Poliza polizaActualizada) {
//        if (polizaActualizada instanceof PolizaMovil && polizaMovilRepository.existsById(id)) {
//            ((PolizaMovil) polizaActualizada).setId(id);
//            return polizaMovilRepository.save((PolizaMovil) polizaActualizada);
//        } else if (polizaActualizada instanceof PolizaVehicular && polizaVehicularRepository.existsById(id)) {
//            ((PolizaVehicular) polizaActualizada).setId(id);
//            return polizaVehicularRepository.save((PolizaVehicular) polizaActualizada);
//        } else if (polizaActualizada instanceof PolizaInmobiliaria && polizaInmobiliariaRepository.existsById(id)) {
//            ((PolizaInmobiliaria) polizaActualizada).setId(id);
//            return polizaInmobiliariaRepository.save((PolizaInmobiliaria) polizaActualizada);
//        } else {
//            throw new IllegalArgumentException("Póliza no encontrada o tipo de póliza no soportado");
//        }
//    }
    
}
