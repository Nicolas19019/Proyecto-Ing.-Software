package com.BolsaValores.Andina.Trading.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BolsaValores.Andina.Trading.model.Detalle_Facturacion;


public interface RepositoryDeatalle_Facturacion extends JpaRepository<Detalle_Facturacion, Integer>{

	List<Detalle_Facturacion> findByIdfactura(int idfactura);
	
}
