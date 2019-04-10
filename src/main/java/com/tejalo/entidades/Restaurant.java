package com.tejalo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Restaurant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(length = 50)
	private String razonsocial;
	

	private Long adminId;
	
	@Column(length = 50)
	private String direccion;
	
	@Column(length = 50)
	private String telefono;
	
	@Column(length = 50)
	private String latitud;
	
	@Column(length = 50)
	private String longitud;
	
	@Column(length = 50)
	private String logo;
	
	@Column(length = 50)
	private String descripcion;
	
	@Column(length = 1)
	private String garaje;
	
	@Column(length = 1)
	private String terraza;
	
	@Column(length = 4)
	private String mesas;
	
	@Column(length = 4)
	private String aforo;
	
	@Column(length = 1)
	private String aireacondicionado;
	

	private Long tipoId;


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getRazonsocial() {
		return razonsocial;
	}


	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}


	public Long getAdminId() {
		return adminId;
	}


	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getLatitud() {
		return latitud;
	}


	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}


	public String getLongitud() {
		return longitud;
	}


	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}


	public String getLogo() {
		return logo;
	}


	public void setLogo(String logo) {
		this.logo = logo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getGaraje() {
		return garaje;
	}


	public void setGaraje(String garaje) {
		this.garaje = garaje;
	}


	public String getTerraza() {
		return terraza;
	}


	public void setTerraza(String terraza) {
		this.terraza = terraza;
	}


	public String getMesas() {
		return mesas;
	}


	public void setMesas(String mesas) {
		this.mesas = mesas;
	}


	public String getAforo() {
		return aforo;
	}


	public void setAforo(String aforo) {
		this.aforo = aforo;
	}


	public String getAireacondicionado() {
		return aireacondicionado;
	}


	public void setAireacondicionado(String aireacondicionado) {
		this.aireacondicionado = aireacondicionado;
	}


	public Long getTipoId() {
		return tipoId;
	}


	public void setTipoId(Long tipoId) {
		this.tipoId = tipoId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
