package com.BolsaValores.Andina.Trading.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	
	@Id
	@Column(name = "IdEmpresa")
	private int idEmpresa;
	
	@Column(name = "ValorAccion")
	private int valorAccion;
	
	@Column(name = "TotalAcciones")
	private int TotalAcciones;

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
	 * @return the valorAccion
	 */
	public int getValorAccion() {
		return valorAccion;
	}

	/**
	 * @param valorAccion the valorAccion to set
	 */
	public void setValorAccion(int valorAccion) {
		this.valorAccion = valorAccion;
	}

	/**
	 * @return the totalAcciones
	 */
	public int getTotalAcciones() {
		return TotalAcciones;
	}

	/**
	 * @param totalAcciones the totalAcciones to set
	 */
	public void setTotalAcciones(int totalAcciones) {
		TotalAcciones = totalAcciones;
	}
	
	
	

}
