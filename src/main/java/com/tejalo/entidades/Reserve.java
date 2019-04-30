package com.tejalo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Reserve implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(length = 50)
	private String ruc;
	
	@Column(length = 50)
	private String userid;
	
	@Column(length = 50)
	private String fechadesolicitud;
	
	@Column(length = 50)
	private String fechadereserva;
	
	@Column(length = 50)
	private String personas;
	
	@Column(length = 5)
	private String activo;
	
	public Long getCodigo() {
		return codigo;
	}




	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}




	public String getRuc() {
		return ruc;
	}




	public void setRuc(String ruc) {
		this.ruc = ruc;
	}




	public String getUserid() {
		return userid;
	}




	public void setUserid(String userid) {
		this.userid = userid;
	}




	public String getFechadesolicitud() {
		return fechadesolicitud;
	}




	public void setFechadesolicitud(String fechadesolicitud) {
		this.fechadesolicitud = fechadesolicitud;
	}




	public String getFechadereserva() {
		return fechadereserva;
	}




	public void setFechadereserva(String fechadereserva) {
		this.fechadereserva = fechadereserva;
	}




	public String getPersonas() {
		return personas;
	}




	public void setPersonas(String personas) {
		this.personas = personas;
	}




	public String getActivo() {
		return activo;
	}




	public void setActivo(String activo) {
		this.activo = activo;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
