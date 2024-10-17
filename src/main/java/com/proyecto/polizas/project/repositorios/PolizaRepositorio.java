package com.proyecto.polizas.project.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.polizas.project.modelos.Poliza;

@Repository
public interface PolizaRepositorio extends JpaRepository<Poliza, Long> {

}
