package com.proyecto.polizas.project.repositoriotest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.proyecto.polizas.project.modelos.PolizaMovil;
import com.proyecto.polizas.project.repositorios.PolizaMovilRepository;

@DataJpaTest
@ActiveProfiles("test")
public class PolizaMovilRepositoryTest {

	@Autowired
    private PolizaMovilRepository repository;

    @Test
    public void testCreatePolizaMovil() {
        PolizaMovil poliza = new PolizaMovil();
        poliza.setDniAsegurado("87654321");
        poliza.setNombreAsegurado("Maria Lopez");
        poliza.setFechaInicio("2024-02-01");
        poliza.setFechaFin("2025-02-01");
        poliza.setMontoAsegurado(5000.0);
        poliza.setMarcaMovil("Samsung");
        poliza.setModeloMovil("Galaxy S21");

        PolizaMovil savedPoliza = repository.save(poliza);

        assertThat(savedPoliza).isNotNull();
        assertThat(savedPoliza.getId()).isNotNull();
    }
}
