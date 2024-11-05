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
	private double valorAccion;
	
	@Column(name = "nombre")
	private String nombre;

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
	public double getValorAccion() {
		return valorAccion;
	}

	/**
	 * @param valorAccion the valorAccion to set
	 */
	public void setValorAccion(double valorAccion) {
		this.valorAccion = valorAccion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
