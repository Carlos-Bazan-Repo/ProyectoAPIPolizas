package com.proyecto.polizas.project.modelos;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Poliza implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	private String dni_Asegurado;
	private String nombre_Asegurado;
	private String tipo_Seguro;
	private String fecha_Inicio;
	private String fecha_Fin;
	private int monto_Asegurado;
	
	
	public Poliza() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDni_Asegurado() {
		return dni_Asegurado;
	}


	public void setDni_Asegurado(String dni_Asegurado) {
		this.dni_Asegurado = dni_Asegurado;
	}


	public String getNombre_Asegurado() {
		return nombre_Asegurado;
	}


	public void setNombre_Asegurado(String nombre_Asegurado) {
		this.nombre_Asegurado = nombre_Asegurado;
	}


	public String getTipo_Seguro() {
		return tipo_Seguro;
	}


	public void setTipo_Seguro(String tipo_Seguro) {
		this.tipo_Seguro = tipo_Seguro;
	}


	public String getFecha_Inicio() {
		return fecha_Inicio;
	}


	public void setFecha_Inicio(String fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}


	public String getFecha_Fin() {
		return fecha_Fin;
	}


	public void setFecha_Fin(String fecha_Fin) {
		this.fecha_Fin = fecha_Fin;
	}


	public int getMonto_Asegurado() {
		return monto_Asegurado;
	}


	public void setMonto_Asegurado(int monto_Asegurado) {
		this.monto_Asegurado = monto_Asegurado;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
	
	
	
