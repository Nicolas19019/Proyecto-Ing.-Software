package com.BolsaValores.Andina.Trading.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comisionista")
public class Comisionista {

	@Id
	@Column(name = "IdComisionista")
	private int idcomisionista;
	
	@Column(name = "Cedula")
	private int cedula;
	
	@Column(name = "Correo")
	private String correo;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "comision")
	private double comision;
	
	@Column(name = "Contraseña")
	private String contra;

	@Column(name = "Usuario")
	private String user;
	
	@Column(name = "pais")
	private String pais;
	
	/**
	 * @return the idcomisionista
	 */
	public int getIdcomisionista() {
		return idcomisionista;
	}

	/**
	 * @param idcomisionista the idcomisionista to set
	 */
	public void setIdcomisionista(int idcomisionista) {
		this.idcomisionista = idcomisionista;
	}

	/**
	 * @return the cedula
	 */
	public int getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
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

	/**
	 * @return the comision
	 */
	public double getComision() {
		return comision;
	}

	/**
	 * @param comision the comision to set
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}

	/**
	 * @return the contra
	 */
	public String getContra() {
		return contra;
	}

	/**
	 * @param contra the contra to set
	 */
	public void setContra(String contra) {
		this.contra = contra;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
