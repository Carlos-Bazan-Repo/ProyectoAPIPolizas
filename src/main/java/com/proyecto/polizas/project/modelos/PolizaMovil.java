package com.proyecto.polizas.project.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movil")
public class PolizaMovil {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dniAsegurado;
    private String nombreAsegurado;
    private String fechaInicio;
    private String fechaFin;
    private Double montoAsegurado;
    private String modeloMovil;
    private String marcaMovil;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDniAsegurado() {
		return dniAsegurado;
	}
	public void setDniAsegurado(String dniAsegurado) {
		this.dniAsegurado = dniAsegurado;
	}
	public String getNombreAsegurado() {
		return nombreAsegurado;
	}
	public void setNombreAsegurado(String nombreAsegurado) {
		this.nombreAsegurado = nombreAsegurado;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Double getMontoAsegurado() {
		return montoAsegurado;
	}
	public void setMontoAsegurado(Double montoAsegurado) {
		this.montoAsegurado = montoAsegurado;
	}
	public String getModeloMovil() {
		return modeloMovil;
	}
	public void setModeloMovil(String modeloMovil) {
		this.modeloMovil = modeloMovil;
	}
	public String getMarcaMovil() {
		return marcaMovil;
	}
	public void setMarcaMovil(String marcaMovil) {
		this.marcaMovil = marcaMovil;
	}
    
    

    
}