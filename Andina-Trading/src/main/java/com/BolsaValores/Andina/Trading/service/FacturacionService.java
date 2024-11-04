package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryFacturacion;
import com.BolsaValores.Andina.Trading.model.Factura;


@Service
public class FacturacionService {

	@Autowired
	private RepositoryFacturacion repo;
	
	public List<Factura> getallFacturas(){
		return repo.findAll();
	}
	
	public Optional<Factura> getFacturabyid(int id){
		return repo.findById(id);
	}
	
	public Factura createFactura(Factura fact) {
		return repo.save(fact);
	}
	
	public Factura updateFactura(Factura fact) {
		return repo.save(fact);
	}
	
	public void deleteFactura(int id) {
		repo.deleteById(id);
	}
	
}
