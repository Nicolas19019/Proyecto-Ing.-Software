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
	
	public Comisionista createComisionista(Comisionista comis) {
		return repo.save(comis);
	}
	
	public Comisionista updateComisionista(Comisionista comis) {
		return repo.save(comis);
	}
	
	public void deleteComisionista(int id) {
		repo.deleteById(id);
	}
	
	public Optional<Comisionista> findByUserAndContra(String user, String contra) {
        return repo.findByUserAndContra(user, contra);
	}
}
