package com.proyecto.polizas.project.repositoriotest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.proyecto.polizas.project.modelos.PolizaVehicular;
import com.proyecto.polizas.project.repositorios.PolizaVehicularRepository;

@DataJpaTest
@ActiveProfiles("test")
public class PolizaVehicularRepositoryTest {
	@Autowired
    private PolizaVehicularRepository repository;

    @Test
    public void testCreatePolizaVehicular() {
        PolizaVehicular poliza = new PolizaVehicular();
        poliza.setDniAsegurado("11223344");
        poliza.setNombreAsegurado("Carlos Sanchez");
        poliza.setFechaInicio("2024-03-01");
        poliza.setFechaFin("2025-03-01");
        poliza.setMontoAsegurado(20000.0);
        poliza.setPlacaVehiculo("ABC-123");
        poliza.setModeloVehiculo("Toyota Corolla");

        PolizaVehicular savedPoliza = repository.save(poliza);

        assertThat(savedPoliza).isNotNull();
        assertThat(savedPoliza.getId()).isNotNull();
    }

}
