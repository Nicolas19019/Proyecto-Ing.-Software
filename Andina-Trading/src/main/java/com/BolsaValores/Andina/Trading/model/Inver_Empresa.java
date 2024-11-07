package com.BolsaValores.Andina.Trading.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inver_empresa")
public class Inver_Empresa {

	@Id
	@Column(name = "IdAcciones")
	private int idAcciones;
	
	@Column(name = "IdEmpresa ")
	private int idEmpresa;
	
	@Column(name = "IdInversionista ")
	private int idInversionista;
	
	@Column(name = "Porcentaje")
	private double porcentaje;

	
	


	/**
	 * @return the idAcciones
	 */
	public int getIdAcciones() {
		return idAcciones;
	}

	/**
	 * @param idAcciones the idAcciones to set
	 */
	public void setIdAcciones(int idAcciones) {
		this.idAcciones = idAcciones;
	}

	/**
	 * @return the idEmpresa
	 */
	public int getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
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
	 * @return the porcentaje
	 */
	public double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
}
