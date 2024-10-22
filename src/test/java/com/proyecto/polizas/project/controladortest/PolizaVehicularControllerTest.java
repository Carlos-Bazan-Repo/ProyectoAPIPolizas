package com.proyecto.polizas.project.controladortest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.polizas.project.controladores.PolizaVehicularControlador;
import com.proyecto.polizas.project.modelos.PolizaVehicular;
import com.proyecto.polizas.project.repositorios.PolizaVehicularRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PolizaVehicularControlador.class)
public class PolizaVehicularControllerTest {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private PolizaVehicularRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreatePolizaVehicular() throws Exception {
        PolizaVehicular poliza = new PolizaVehicular();
        poliza.setDniAsegurado("11223344");
        poliza.setNombreAsegurado("Carlos Sanchez");
        poliza.setFechaInicio("2024-03-01");
        poliza.setFechaFin("2025-03-01");
        poliza.setMontoAsegurado(20000.0);
        poliza.setPlacaVehiculo("ABC-123");
        poliza.setModeloVehiculo("Toyota Corolla");

        mockMvc.perform(post("/polizas/vehiculares")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(poliza)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.dniAsegurado").value("11223344"));
    }
}
