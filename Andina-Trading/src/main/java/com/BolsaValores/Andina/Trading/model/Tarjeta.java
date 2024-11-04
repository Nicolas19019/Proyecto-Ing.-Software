package com.BolsaValores.Andina.Trading.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tarjeta")
public class Tarjeta {
	
	@Id
	@Column(name="id_tarjeta")
	private int id_tarjeta;
	
	@Column(name="id_inversionista")
	private int id_inversionista;
	
	@Column(name="numero_tarjeta")
	private String numero_tarjeta;
	
	@Column(name="nombre_titular")
	private String nombre_titular;
	
	@Column(name="fecha_vencimiento")
	private String fecha_vencimiento;
	
	@Column(name="tipo_tarjeta")
	private String tipo_tarjeta;
	
	@Column(name="cvv")
	private int cvv;

	/**
	 * @return the id_tarjeta
	 */
	public int getId_tarjeta() {
		return id_tarjeta;
	}

	/**
	 * @param id_tarjeta the id_tarjeta to set
	 */
	public void setId_tarjeta(int id_tarjeta) {
		this.id_tarjeta = id_tarjeta;
	}

	/**
	 * @return the id_inversionista
	 */
	public int getId_inversionista() {
		return id_inversionista;
	}

	/**
	 * @param id_inversionista the id_inversionista to set
	 */
	public void setId_inversionista(int id_inversionista) {
		this.id_inversionista = id_inversionista;
	}

	/**
	 * @return the numero_tarjeta
	 */
	public String getNumero_tarjeta() {
		return numero_tarjeta;
	}

	/**
	 * @param numero_tarjeta the numero_tarjeta to set
	 */
	public void setNumero_tarjeta(String numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}

	/**
	 * @return the nombre_titular
	 */
	public String getNombre_titular() {
		return nombre_titular;
	}

	/**
	 * @param nombre_titular the nombre_titular to set
	 */
	public void setNombre_titular(String nombre_titular) {
		this.nombre_titular = nombre_titular;
	}

	/**
	 * @return the fecha_vencimiento
	 */
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	/**
	 * @param fecha_vencimiento the fecha_vencimiento to set
	 */
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	/**
	 * @return the tipo_tarjeta
	 */
	public String getTipo_tarjeta() {
		return tipo_tarjeta;
	}

	/**
	 * @param tipo_tarjeta the tipo_tarjeta to set
	 */
	public void setTipo_tarjeta(String tipo_tarjeta) {
		this.tipo_tarjeta = tipo_tarjeta;
	}

	/**
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}

	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	

}
