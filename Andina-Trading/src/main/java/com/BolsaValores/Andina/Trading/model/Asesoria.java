package com.BolsaValores.Andina.Trading.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "asesoria")
public class Asesoria {

	@Id
	@Column(name = "IdAsesoria")
	private int idAsesoria;
	
	@Column(name = "IdComisionista ")
	private int idComisionista;
	
	@Column(name = "IdInversionista")
	private int idInversionista;
	
	@Column(name = "MontoPagado")
	private int montoPagado;
	
	@Column(name = "Fecha")
	private Date fecha;
	
	@Column(name = "Hora")
	private String hora;

	/**
	 * @return the idAsesoria
	 */
	public int getIdAsesoria() {
		return idAsesoria;
	}

	/**
	 * @param idAsesoria the idAsesoria to set
	 */
	public void setIdAsesoria(int idAsesoria) {
		this.idAsesoria = idAsesoria;
	}

	/**
	 * @return the idComisionista
	 */
	public int getIdComisionista() {
		return idComisionista;
	}

	/**
	 * @param idComisionista the idComisionista to set
	 */
	public void setIdComisionista(int idComisionista) {
		this.idComisionista = idComisionista;
	}

	/**
	 * @return the idInversionista
	 */
	public int getIdInversionista() {
		return idInversionista;
	}

	/**
	 * @param idInversionista the idInversionista to set
	 */
	public void setIdInversionista(int idInversionista) {
		this.idInversionista = idInversionista;
	}

	/**
	 * @return the montoPagado
	 */
	public int getMontoPagado() {
		return montoPagado;
	}

	/**
	 * @param montoPagado the montoPagado to set
	 */
	public void setMontoPagado(int montoPagado) {
		this.montoPagado = montoPagado;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
