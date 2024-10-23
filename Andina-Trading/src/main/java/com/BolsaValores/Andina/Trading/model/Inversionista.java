package com.BolsaValores.Andina.Trading.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inversionista")
public class Inversionista {

	@Id
	@Column(name = "Idinver")
	private int idinversionista;
	
	@Column(name = "Cedula")
	private int cedula;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Correo")
	private String correo;
	
	@Column(name = "Acciones")
	private int acciones;
	
	@Column(name = "Monto")
	private int monto;

	@Column(name = "Contraseña")
	private String contrasena;
	
	@Column(name = "Usuario")
	private String usuario;
	
	@Column(name = "pais")
	private String pais;
	
	/**
	 * @return the idinversionista
	 */
	public int getIdinversionista() {
		return idinversionista;
	}

	/**
	 * @param idinversionista the idinversionista to set
	 */
	public void setIdinversionista(int idinversionista) {
		this.idinversionista = idinversionista;
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
	 * @return the acciones
	 */
	public int getAcciones() {
		return acciones;
	}

	/**
	 * @param acciones the acciones to set
	 */
	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}

	/**
	 * @return the monto
	 */
	public int getMonto() {
		return monto;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * @return the user
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param user the user to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
