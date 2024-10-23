package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryAsesoria;
import com.BolsaValores.Andina.Trading.model.Asesoria;

@Service
public class AsesoriaService {

	@Autowired
	private RepositoryAsesoria repo;
	
	public List<Asesoria> getallAsesorias(){	
		return repo.findAll();	
	}
	
	public Optional<Asesoria> getAsesoriabyid(int id){
		return repo.findById(id);
	}
	
	public Asesoria createAsesoria(Asesoria asesoria) {
		return repo.save(asesoria);
	}
	
	public Asesoria updateAsesoria(Asesoria asesoria) {
		return repo.save(asesoria);
	}
	
	public void deleteAsesoria(int id) {
		repo.deleteById(id);
	}
}
