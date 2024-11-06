package com.BolsaValores.Andina.Trading.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BolsaValores.Andina.Trading.model.Factura;


public interface RepositoryFacturacion extends JpaRepository<Factura, Integer>{

	List<Factura> findByEstado(String estado);
	
	List<Factura> findByIdinversionista(int id_inversionista);
}
