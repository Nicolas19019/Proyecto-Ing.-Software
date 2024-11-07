package com.BolsaValores.Andina.Trading.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BolsaValores.Andina.Trading.Repository.RepositoryEmpresa;
import com.BolsaValores.Andina.Trading.model.Empresa;

@Service
public class EmpresaService {

	@Autowired
	private RepositoryEmpresa repo;
	
	public List<Empresa> getallEmpresas(){
		return repo.findAll();
	}
	
	public Optional<Empresa> getEmpresabyid(int id){
		return repo.findById(id);
	}
	
	public Optional<Empresa> getEmpresabynombre(String nombre){
		return repo.findByNombre(nombre);
	}
	
	public Empresa createEmpresa(Empresa empresa) {
		return repo.save(empresa);
	}
	
	public Empresa updateEmpresa(Empresa empresa) {
		return repo.save(empresa);
	}
	
	public void deleteEmpresa(int id) {
		repo.deleteById(id);
	}
	
	public boolean existeEmpresa(String empresa) {
		return repo.existsByNombre(empresa);
	}
}
