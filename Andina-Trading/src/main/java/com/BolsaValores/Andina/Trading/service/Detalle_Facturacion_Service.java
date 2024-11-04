package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryDeatalle_Facturacion;
import com.BolsaValores.Andina.Trading.model.Detalle_Facturacion;

@Service
public class Detalle_Facturacion_Service {

	@Autowired
	private RepositoryDeatalle_Facturacion repo;
	
	public List<Detalle_Facturacion> getallDetalle_Facturacion(){
		return repo.findAll();
	}
	
	public Optional<Detalle_Facturacion> getDetalle_Facturacionyid(int id){
		return repo.findById(id);
	}
	
	public Detalle_Facturacion createDetalle_Facturacion(Detalle_Facturacion factura) {
		return repo.save(factura);
	}
	
	public Detalle_Facturacion updateDetalle_Facturacion(Detalle_Facturacion factura) {
		return repo.save(factura);
	}
	
	public void deleteDetalle_Facturacion(int id) {
		repo.deleteById(id);
	}
}
