package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryInversionista;
import com.BolsaValores.Andina.Trading.model.Inversionista;

@Service
public class InversionistaService {

	private RepositoryInversionista repo;

	public List<Inversionista> getallInversionistas() {
		return repo.findAll();
	}

	public Optional<Inversionista> getinversionistabyid(int id) {
		return repo.findById(id);
	}

	public Inversionista createInversionista(Inversionista inver) {
		return repo.save(inver);
	}

	public Inversionista updateInversionista(Inversionista inver) {
		return repo.save(inver);
	}
	
	public void deleteinversionista(int id) {
		repo.deleteById(id);
	}
}
