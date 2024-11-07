package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryInver_Empresa;
import com.BolsaValores.Andina.Trading.model.Inver_Empresa;

@Service
public class Inver_EmpresaService {

	@Autowired
	private RepositoryInver_Empresa repo;
	
	public List<Inver_Empresa> getallInversion(){
		return repo.findAll();
	}
	
	public Optional<Inver_Empresa> getInversionbyid(int id){
		return repo.findById(id);
	}
	
	public Inver_Empresa createInversion(Inver_Empresa inversion) {
		return repo.save(inversion);
	}
	
	public Inver_Empresa updateInversion(Inver_Empresa inversion) {
		return repo.save(inversion);
	}
	
	public void deleteInversion(int id) {
		repo.deleteById(id);
	}
	
	public boolean existeInversion(int idEmpresa) {
		return repo.existsByIdEmpresa(idEmpresa);
	}
}
