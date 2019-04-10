package com.tejalo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Admin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(length = 50)
	private String correo;
	
	@Column(length = 20)
	private String password;
	
	@Column(length = 20)
	private String ruc;
	
	@Column(length = 20)
	private String fechadealta;
	
	@Column(length = 20)
	private String fechadebaja;
	
	@Column(length = 1)
	private String activo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFechadealta() {
		return fechadealta;
	}

	public void setFechadealta(String fechadealta) {
		this.fechadealta = fechadealta;
	}

	public String getFechadebaja() {
		return fechadebaja;
	}

	public void setFechadebaja(String fechadebaja) {
		this.fechadebaja = fechadebaja;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	
	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
