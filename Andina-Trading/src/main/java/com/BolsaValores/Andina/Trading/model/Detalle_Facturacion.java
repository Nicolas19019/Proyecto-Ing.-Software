package com.BolsaValores.Andina.Trading.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detalle_facturacion")
public class Detalle_Facturacion {

	@Id
	@Column(name="id_detalle")
	private int id_detalle;
	
	@Column(name="id_factura")
	private int id_factura;
	
	@Column(name="nombre_accion")
	private String nombre_accion;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="valor")
	private double valor;


	/**
	 * @return the id_detalle
	 */
	public int getId_detalle() {
		return id_detalle;
	}

	/**
	 * @param id_detalle the id_detalle to set
	 */
	public void setId_detalle(int id_detalle) {
		this.id_detalle = id_detalle;
	}

	/**
	 * @return the id_factura
	 */
	public int getId_factura() {
		return id_factura;
	}

	/**
	 * @param id_factura the id_factura to set
	 */
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}

	/**
	 * @return the nombre_accion
	 */
	public String getNombre_accion() {
		return nombre_accion;
	}

	/**
	 * @param nombre_accion the nombre_accion to set
	 */
	public void setNombre_accion(String nombre_accion) {
		this.nombre_accion = nombre_accion;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
