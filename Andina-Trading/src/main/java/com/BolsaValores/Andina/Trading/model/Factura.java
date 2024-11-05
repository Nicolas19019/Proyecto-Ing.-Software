package com.BolsaValores.Andina.Trading.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="facturacion")
public class Factura {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id_factura")
	private int id_factura;
	
	@Column(name="id_inversionista")
	private int id_inversionista;
	
	@Column(name="fecha_factura")
	private Date fecha_factura;
	
	@Column(name="total")
	private double total;
	
	@Column(name="estado")
	private String estado;

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
	 * @return the fecha_factura
	 */
	public Date getFecha_factura() {
		return fecha_factura;
	}

	/**
	 * @param fecha_factura the fecha_factura to set
	 */
	public void setFecha_factura(Date fecha_factura) {
		this.fecha_factura = fecha_factura;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
