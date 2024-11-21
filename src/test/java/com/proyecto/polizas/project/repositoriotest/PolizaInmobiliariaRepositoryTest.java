package com.proyecto.polizas.project.repositoriotest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.proyecto.polizas.project.modelos.PolizaInmobiliaria;
import com.proyecto.polizas.project.repositorios.PolizaInmobiliariaRepository;

@DataJpaTest
@ActiveProfiles("test")
public class PolizaInmobiliariaRepositoryTest {

	@Autowired
    private PolizaInmobiliariaRepository repository;

    @Test
    public void testCreatePolizaInmobiliaria() {
        PolizaInmobiliaria poliza = new PolizaInmobiliaria();
        poliza.setDniAsegurado("12345678");
        poliza.setNombreAsegurado("Juan Perez");
        poliza.setFechaInicio("2024-01-01");
        poliza.setFechaFin("2025-01-01");
        poliza.setMontoAsegurado(100000.0);
        poliza.setDireccionInmueble("Calle Falsa 123");
        poliza.setValorInmueble("200000");

        PolizaInmobiliaria savedPoliza = repository.save(poliza);

        assertThat(savedPoliza).isNotNull();
        assertThat(savedPoliza.getId()).isNotNull();
    }
}
