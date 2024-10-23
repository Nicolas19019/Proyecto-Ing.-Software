package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryComisionista;
import com.BolsaValores.Andina.Trading.model.Comisionista;

@Service
public class ComisionistaService {

	@Autowired
	private RepositoryComisionista repo;
	
	public List<Comisionista> getallComisionistas(){
		return repo.findAll();
	}
	
	public Optional<Comisionista> getcomisionistabyid(int id){
		return repo.findById(id);
	}
	
	public Comisionista createComisionista(Comisionista comisionista) {
		return repo.save(comisionista);
	}
	
	public Comisionista updateComisionista(Comisionista comisionista) {
		return repo.save(comisionista);
	}
	
	public void deleteComisionista(Comisionista comisionista) {
		repo.delete(comisionista);
	}
	
}
