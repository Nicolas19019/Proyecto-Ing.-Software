package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryTarjeta;
import com.BolsaValores.Andina.Trading.model.Tarjeta;

import jakarta.transaction.Transactional;

@Service
public class TarjetaService {

	@Autowired
	private RepositoryTarjeta repo;

	public List<Tarjeta> getallTarjeta() {
		return repo.findAll();
	}

	public Optional<Tarjeta> getTarjetabyid(int id) {
		return repo.findById(id);
	}
	
	public Optional<Tarjeta> getTarjetabyidinversionista(int idInversionista){
		
		return repo.findByidInversionista(idInversionista);
	}

	public Tarjeta createTarjeta(Tarjeta tarjeta) {
		return repo.save(tarjeta);
	}

	public Tarjeta updateTarjeta(Tarjeta tarjeta) {
		return repo.save(tarjeta);
	}

	public void deleteTarjeta(int id) {
		repo.deleteById(id);
	}
	
	@Transactional
	public void deleteTarjetaByidInversionista(int idInversionista) {
		repo.deleteByidInversionista(idInversionista);
	}

	public boolean tieneTarjeta(int idInversionista) {
		return repo.existsByidInversionista(idInversionista);
	}

}
