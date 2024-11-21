package com.proyecto.polizas.project.controladortest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.polizas.project.controladores.PolizaInmobiliariaControlador;
import com.proyecto.polizas.project.modelos.PolizaInmobiliaria;
import com.proyecto.polizas.project.repositorios.PolizaInmobiliariaRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PolizaInmobiliariaControlador.class)
public class PolizaInmobiliariaControllerTest {
	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private PolizaInmobiliariaRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreatePolizaInmobiliaria() throws Exception {
        PolizaInmobiliaria poliza = new PolizaInmobiliaria();
        poliza.setDniAsegurado("12345678");
        poliza.setNombreAsegurado("Juan Perez");
        poliza.setFechaInicio("2024-01-01");
        poliza.setFechaFin("2025-01-01");
        poliza.setMontoAsegurado(100000.0);
        poliza.setDireccionInmueble("Calle Falsa 123");
        poliza.setValorInmueble("200000");

        mockMvc.perform(post("/polizas/inmobiliarias")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(poliza)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.dniAsegurado").value("12345678"));
    }

}
