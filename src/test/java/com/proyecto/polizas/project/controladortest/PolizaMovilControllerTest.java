package com.proyecto.polizas.project.controladortest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.polizas.project.controladores.PolizaMovilControlador;
import com.proyecto.polizas.project.modelos.PolizaMovil;
import com.proyecto.polizas.project.repositorios.PolizaMovilRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PolizaMovilControlador.class)
public class PolizaMovilControllerTest {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private PolizaMovilRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreatePolizaMovil() throws Exception {
        PolizaMovil poliza = new PolizaMovil();
        poliza.setDniAsegurado("87654321");
        poliza.setNombreAsegurado("Maria Lopez");
        poliza.setFechaInicio("2024-02-01");
        poliza.setFechaFin("2025-02-01");
        poliza.setMontoAsegurado(5000.0);
        poliza.setMarcaMovil("Samsung");
        poliza.setModeloMovil("Galaxy S21");

        mockMvc.perform(post("/polizas/moviles")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(poliza)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.dniAsegurado").value("87654321"));
    }
}
